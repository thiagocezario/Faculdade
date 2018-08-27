public class Retangulo extends Formas{
	// Properties
	private double lado;
	private double altura;
	
	// Constructor
	public Retangulo(double lado, double altura){
		this.setLado(lado);
		this.setAltura(altura);
	}

	// Gets and Sets
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws RuntimeException{
		if (altura < 0) throw new RuntimeException("Nao pode ter valor negativo");
		this.altura = altura;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) throws RuntimeException{
		if (lado < 0) throw new RuntimeException("Nao pode ter valor negativo");
		this.lado = lado;
	}
	
	// Methods
	public double area() {
		double lado = this.getLado();
		double altura = this.getAltura();
		
		double area = lado*altura;
		
		return area;
	}
	
	public double perimetro() {
		double lado = this.getLado();
		double altura = this.getAltura();
		
		double perimetro = (lado*2)+(altura*2);
		
		return perimetro;
	}
}
