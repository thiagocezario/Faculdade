import java.util.Scanner;

public class Salario {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double desconto = 0;
		double horasTrabalhadas = 0;
		double salarioHora = 0;
		
		System.out.println("Insira o salario/hora");
		salarioHora = PegaEntradas();
		
		System.out.println("Insira as horas trabalhadas");
		horasTrabalhadas = PegaEntradas();
		
		System.out.println("Insira o valor do desconto");
		desconto = PegaEntradas();
		
		ExibeSalario(salarioHora, horasTrabalhadas, desconto);
	}
	
	public static double CalculoSalarioBruto(double salarioHora, double horasTrabalhadas) throws RuntimeException{
		if (salarioHora < 0 || horasTrabalhadas < 0) {
			throw new RuntimeException("Valores invalidos");
		}
			
		return salarioHora*horasTrabalhadas;
	}
	
	public static double CalculoSalarioLiquido(double salarioBruto, double desconto) throws RuntimeException{
		if(salarioBruto < 0 || desconto < 0 || desconto > 1) {
			throw new RuntimeException("Valores invalidos");
		}
		return salarioBruto - (salarioBruto*desconto);
	}
	
	private static double PegaEntradas() throws RuntimeException{
		double entrada = 0;
		
		try {
			entrada = sc.nextDouble();
		}catch(RuntimeException ex) {
			throw new RuntimeException("Valor não é um numero!!!");
		}
		
		return entrada;
	}
	
	private static void ExibeSalario(double salarioHora, double horasTrabalhadas, double desconto) {
		double salarioBruto = CalculoSalarioBruto(salarioHora, horasTrabalhadas);
		double salarioLiquido = CalculoSalarioLiquido(salarioBruto, desconto);
		
		System.out.println("Extrato Salario");
		System.out.printf("Valor Hora: R$%.2f\n", salarioHora);
		System.out.printf("Horas Trabalhadas: %.0f\n", horasTrabalhadas);
		System.out.printf("Salario Bruto: R$%.2f\n", salarioBruto);
		System.out.printf("Salario Liquido: R$%.2f\n", salarioLiquido);
	}
}
