import java.util.Scanner;

public class Salario {
	private static Scanner read;

	public static void main (String[] args) {
		read = new Scanner(System.in);
		boolean sair = true;
		
		int numFunc = 0;
		
		do {
			System.out.println("Insira quantos funcionarios existem na empresa: ");
			try {
				numFunc = read.nextInt();
			} catch (Exception x) {
				System.out.println("Valor invalido.\n");
				sair = false;
			}
		} while (!sair);
		
		String nome[] = new String[numFunc];
		double salario[] = new double[numFunc];
		
		int i = 0;
		do {
			sair = false;
			
			System.out.println("\nInsira o nome do funcionario: ");
			nome[i] = read.next();
			
			System.out.println("\nInsira o salario do funcionario: ");
			while (!sair) {
				try {
					salario[i] = read.nextDouble();
					sair = true;
				} catch (Exception x) {
					System.out.println("Valor invalido.\n");
				}
			}
			
			i++;
		} while (i < numFunc);
		
		double media = MediaSalarial(salario);
		
		System.out.printf("A media salarial �: %.2f\n", media);
		
		ImprimeLista(nome, salario, media);
	}
	
	public static double MediaSalarial (double array[]) {
		double media = 0;
		
		for (int i = 0; i < array.length; i++) {
			media += array[i];
		}
		
		media /= array.length;
		
		return media;
	}
	
	public static void ImprimeLista(String nome[], double salario[], double media) {
		for(int i = 0; i < salario.length; i++) {
			if (salario[i] > media) {
				System.out.printf("%s\tR$%.2f\n", nome[i], salario[i]);
			}
		}
	}
}
