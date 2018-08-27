import java.util.ArrayList;
import java.util.Scanner;

public class Formas {
	static Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.println("Quantas formas deseja criar?");
		String qntd = scanner.next();
		
		ArrayList<Formas> formas = new ArrayList<Formas>();
		
		try {
			int quantia = Integer.parseInt(qntd);
			while(quantia > 0) {
				System.out.println("Escolha qual area deseja calcular:");
				System.out.println("1 - Circunferencia");
				System.out.println("2 - Triangulo");
				System.out.println("3 - Retangulo");
				System.out.println("0 - Sair");
				
				String opcao = scanner.next();
				
				switch(opcao) {
				case "1":
					System.out.println("Insira o valor do raio:");
					double raio = scanner.nextDouble();
					
					try {
						Circunferencia circ = new Circunferencia(raio);
						formas.add(circ);
					}
					catch(Exception ex) {
						System.out.println(ex);
					}
					break;
					
				case "2":
					System.out.println("Insira o valor da base:");
					double base = scanner.nextDouble();
					
					System.out.println("Insira o valor da altura:");
					double alturaTriangulo = scanner.nextDouble();
					
					try {
						Triangulo triangulo = new Triangulo(base, alturaTriangulo);
						formas.add(triangulo);
					}
					catch(Exception ex) {
						System.out.println(ex);
					}
					break;
					
				case "3":
					System.out.println("Insira o valor do lado:");
					double lado = scanner.nextDouble();
					
					System.out.println("Insira o valor da altura:");
					double alturaRetangulo = scanner.nextDouble();
					
					try {
						Retangulo ret = new Retangulo(lado, alturaRetangulo);
						formas.add(ret);
					}
					catch(Exception ex) {
						System.out.println(ex);
					}
					break;
					
				case "0":
					quantia = 0;
					break;
				default:
					System.out.println("Insira um valor da lista");
					break;
				}
				quantia--;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		double area = 0;
		String tipo = "";
		for(Formas forma: formas) {
			switch(forma.getClass().toString()) {
			case "class Circunferencia":
				tipo = "Circunferencia";
				area = ((Circunferencia) forma).area();
				break;
			case "class Retangulo":
				tipo = "Retangulo";
				area = ((Retangulo) forma).area();
				break;
			case "class Triangulo":
				tipo = "Triangulo";
				area = ((Triangulo) forma).area();
				break;
			default:
				tipo = "Sem tipo";
				break;
			}
			
			System.out.printf("Tipo: %s  Area: %.2f", tipo, area);
		}
	}
	
	public static double calculaAreaRetangulo(double lado1, double lado2) throws RuntimeException {
		if (lado1 < 0 || lado2 < 0) {
			throw new RuntimeException("Valor negativo!!!");
		}
		
		return lado1*lado2;
	}
	
	public static double calculaAreaCircunferencia(double raio) throws RuntimeException {
		if (raio < 0) {
			throw new RuntimeException("Valor negativo!!!");
		}
		double area = 2* (raio*raio) * Math.PI;
		
		return area;
	}
	
	public static double calculaAreaTriangulo(double base, double altura) throws RuntimeException {
		if (base < 0 || altura < 0) {
			throw new RuntimeException("Valor negativo!!!");
		}
		
		return (base*altura)/2;
	}
}
