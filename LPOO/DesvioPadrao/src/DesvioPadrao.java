import java.util.Scanner;
import java.lang.Math;

public class DesvioPadrao {
	private static Scanner read = new Scanner(System.in);;
	
	public static void main (String[] args) {
		System.out.println("Entre com o numero de amostras:  ");
		int numeroAmostras = read.nextInt();
		double amostras[] = new double[numeroAmostras];
		
		leAmostras(amostras);
		
		System.out.println("\n\nAmostras:");
		for (int i = 0; i < numeroAmostras; i++) {
			System.out.printf("%.5f  ", amostras[i]);
		}
		
		double desvioPadrao = calculoDesvioPadrao(amostras);
			
		System.out.printf("\nO desvio padrao é: %.5f ", desvioPadrao);
	}
	
	public static double calculoDesvioPadrao(double amostras[]) {
		double desvioPadrao = 0;
		double somatorio = 0;
		double media = calculoMedia(amostras);
		
		for (int i = 0; i < amostras.length; i++) {
			somatorio += Math.pow((amostras[i] - media), 2);
		}
		
		desvioPadrao = Math.sqrt(somatorio/(amostras.length - 1));
		
		return desvioPadrao;
	}
	
	public static double[] leAmostras (double amostras[]) {
		for (int i = 0; i < amostras.length; i++) {
			System.out.printf("Insira o valor"
					+ " da amostra %d:  \n", i+1);
			
			try {
				amostras[i] = read.nextDouble();
			} catch (Exception x){
				System.out.println("Valor invalido.");
				i--;
			}
		}
		
		return amostras;
	}
	
	public static double calculoMedia (double amostras[]) {
		double media = 0;
		double total = 0;
		
		for(int i = 0; i < amostras.length; i++) {
			total += amostras[i];
		}
		
		media = total/amostras.length;
		
		return media;
	}
}
