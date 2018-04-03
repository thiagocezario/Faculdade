import java.util.Scanner;

public class Fibonacci
{
	public static void main (String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int valorA = 0;
		int valorB = 1;
		int valorC = 0;
		
		int valorMaximo = scn.nextInt();
		while (valorMaximo <= 0)
		{
			valorMaximo = scn.nextInt();
		}
		System.out.println(valorA);
		System.out.println(valorB);
		while(valorB < valorMaximo)
		{
			valorC = valorA + valorB;
			valorA = valorB;
			valorB = valorC;
			System.out.println(valorB);
		}
	}
}