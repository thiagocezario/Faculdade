import java.util.Scanner;

public class Indice {
	public static void main (String[] args) {
		double indice[] = new double[7];
		Scanner read = new Scanner(System.in);
		String input;
		int posicao = 0;
		String regex = "^[+-]?\\d+[.]?\\d*";
		double total = 0;
		int dia = 1;

		do {
			System.out.printf("Entre com um valor para o dia %d\n", dia);
			input = read.next();
			
			if (input.matches(regex)) {
				indice[posicao] = Double.parseDouble(input);
				posicao++;
				dia++;
			} else {
				System.out.println("Valor invalido");
			}
			
		} while (posicao < indice.length); 
		
		for(int i = 0; i < posicao; i++) {
			total += indice[posicao - 1];
		}
		
		double media = media(total, posicao);
		System.out.printf("\nA media semanal foi de %smm", media);
		
		double min = minimo(indice);
		dia = dia(indice, min);
		System.out.printf("\nO minimo foi de %smm no dia %d", min, dia);
		
		double max = maximo(indice);
		dia = dia(indice, max);
		System.out.printf("\nO maximo foi de %smm no dia %d", max, dia);
	}
	
	public static double media (double total, int count) {
		return total/count;
	}
	
	public static double minimo (double array[]) {
		double minimo = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(minimo > array[i]) {
				minimo = array[i];
			}
		}
		
		return minimo;
	}
	
	public static double maximo (double array[]) {
		double maximo = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(maximo < array[i]) {
				maximo = array[i];
			}
		}
		
		return maximo;
	}
	
	public static int dia (double array[], double value) {
		int dia = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				dia = i + 1;
				break;
			}
		}
		
		return dia;
	}
}
