import java.util.Scanner;

public class Matriz {
	private static Scanner read;
	
	public static void main (String[] args) {		
		double detP = 0;
		double detS = 0;
		double determinante = 0;
		
		double matriz[][] = new double[3][3];
		matriz = entraMatriz(matriz);
		
		detP = DetPrincipal(matriz);
		detS = DetSecundario(matriz);
		
		determinante = detP + detS;
		
		System.out.printf("\nO valor da determinante principal � %.2f"
				+ "\nO valor da determinante secundaria � %.2f"
				+ "\nO determinante final � %.2f", detP, detS, determinante);
		
	}
	
	public static double DetPrincipal (double matriz[][]) {
		double determinante = 0;
		double detA = 0;
		double detB = 0;
		double detC = 0;
		
		detA = matriz[0][0] * matriz[1][1] * matriz[2][2];
		detB = matriz[0][1] * matriz[1][2] * matriz[2][0];
		detC = matriz[0][2] * matriz[1][0] * matriz[2][1];
		
		determinante = detA + detB + detC;
		
		return determinante;
	}
	
	public static double DetSecundario (double matriz[][]) {
		double determinante = 0;
		double detA = 0;
		double detB = 0;
		double detC = 0;
		
		detA = (matriz[0][2] * matriz[1][1] * matriz[2][0])*(-1);
		detB = (matriz[1][2] * matriz[2][1] * matriz[0][0])*(-1);
		detC = (matriz[2][2] * matriz[0][1] * matriz[1][0])*(-1);
		
		determinante = detA + detB + detC;
		
		return determinante;
	}
	
	public static double[][] entraMatriz(double matriz[][]){
		read = new Scanner(System.in);
		int linha = 3;
		int coluna = 3;
		
		for(int i = 0; i < linha; i ++) {
			for(int j = 0; j < coluna; j ++) {
				System.out.printf("Insira o valor da posicao %dx%d:  ", i+1, j+1);
				matriz[i][j] = read.nextDouble();
			}
		}
		
		return matriz;
	}
}
