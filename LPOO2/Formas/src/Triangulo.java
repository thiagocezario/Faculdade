
public class Triangulo extends Formas{
	// Properties
	private double base;
	private double altura;
	
	// Constructor
	public Triangulo(double base, double altura) throws RuntimeException{
		if (base < 0 || altura < 0) throw new RuntimeException("Valor nao pode ser negativo");
		
		this.base = base;
		this.altura = altura;
	}
	
	
	// GETS and SETS
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Methods
	public double area() {
		double base = this.getBase();
		double altura = this.getAltura();
		
		return (base*altura)/2;
	}
}
