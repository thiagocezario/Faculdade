import java.util.Scanner;

public class SomaPar {
	private static Scanner read;
	
	public static void main (String[] args) {
		read = new Scanner(System.in);
		
		String input = "";
		int tamanhoArray = 20;
		int arrayNumeros[] = new int[tamanhoArray];
		int soma = 0;
		
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.printf("Insira o valor"
					+ " para a posicao %d:  \n", i+1);
			
			input = read.next();
			
			try {
				arrayNumeros[i] = Integer.parseInt(input);
			} catch (Exception x){
				System.out.printf("Valor [%s] invalido.\n", input);
				i--;
			}
		}
		
		soma = Soma(arrayNumeros);
		
		System.out.printf("A soma dos numeros pares é:  %d\n", soma);
	}
	
	public static int Soma (int array[]) {
		int soma = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				soma += array[i];
			}
		}
		
		return soma;
	}
}
