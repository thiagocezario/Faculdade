import java.util.Scanner;

public class Salario
{
	public static void main(String[] args)
	{
		String funcionario = args[0];
		float salarioAtual = Float.parseFloat(args[1]);
		
		System.out.println("O bonus anual eh: " + calculoBonus(funcionario, salarioAtual));
	}
	
	public static float calculoBonus(String funcionario, float salarioAtual)
	{
		Scanner scn = new Scanner(System.in);
		float bonus = 0.0f;
		int gerenciado = 0;
		switch(funcionario){
			case "diretor":
				System.out.println("Insira o numero de dep gerenciados:");
				gerenciado = scn.nextInt();
				bonus = 4*salarioAtual + gerenciado*3000;
				break;
			
			case "gerente":
				System.out.println("Insira o numero de pessoas gerenciadas:");
				gerenciado = scn.nextInt();
				bonus = 2*salarioAtual + gerenciado*100;
				break;
			
			case "analista":
				bonus = salarioAtual;
				break;
				
			case "programador":
				bonus = salarioAtual*0.8f;
				break;
				
			case "auxiliar":
				bonus = salarioAtual*0.5f;
				break;
			
			default:
				break;
		}
		
		return bonus;
	}
}