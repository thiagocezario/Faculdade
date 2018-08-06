/** (Tarefa 1) Construa uma classe com três métodos estáticos:
a. public static double calculaAreaRetangulo(double lado1, double
lado2)
b. public static double calculaAreaCircunferencia(double raio)
c. public static double calculaAreaTriangulo(double base, double
altura)
Se qualquer método receber parâmetros negativos, deve-se levantar a exceção
RuntimeException.
 */
import java.util.Scanner;

public class Formas {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		double lado1, lado2, raio, base, altura, areaCircunferencia = 0, areaRetangulo = 0, areaTriangulo = 0;
		
		lado1 = scanner.nextDouble();
		lado2 = scanner.nextDouble();
		raio = scanner.nextDouble();
		base = scanner.nextDouble();
		altura = scanner.nextDouble();
		
		try {
			areaRetangulo = calculaAreaRetangulo(lado1, lado2);
			areaTriangulo = calculaAreaTriangulo(base, altura);
			areaCircunferencia = calculaAreaCircunferencia(raio);
		} catch (RuntimeException e) {
			System.out.println(e);
		} finally {
			System.out.println("area da circunferencia: " + areaCircunferencia);
			System.out.println("area do retangulo: " + areaRetangulo);
			System.out.println("area do triangulo: " + areaTriangulo);
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
