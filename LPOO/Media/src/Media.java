import java.util.Scanner;

public class Media {
	private static Scanner read;

	public static void main (String[] args) {
		read = new Scanner(System.in);
		
		double vetorMedia[] = new double[15];
		String input = "";
		String regex = "^[+-]?\\d+[.]?\\d*";
		int posicao = 0;
		double total = 0;
		boolean sair = false;
		
		do {
			System.out.println("\nEnter with a value:\n");
			input = read.next();
			
			if (input.matches(regex)) {
				vetorMedia[posicao] = Double.parseDouble(input);
				posicao++;
				
			} else if(input.equals("s")){
				sair = true;
			} else {
				System.out.printf("\n[%s] is an invalid value\n", input);
				
			}
		} while (posicao < vetorMedia.length && !sair); 
		
		System.out.println("\nArray:\n");
		
		for(int i = 0; i < posicao; i++) {
			System.out.printf("%.2f\t", vetorMedia[i]);
			total += vetorMedia[i];
		}
		
		System.out.printf("\n\nMedia:  %.2f\n", total/posicao);
	}
}