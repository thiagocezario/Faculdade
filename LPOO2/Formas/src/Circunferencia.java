public class Circunferencia extends Formas{
	// Properties
	private double raio;
	
	// Constructor
	public Circunferencia(double raio){
		this.setRaio(raio);
	}
	
	// Gets and Sets
	public double getRaio() {
		return this.raio;
	}
	
	public void setRaio(double raio) throws RuntimeException{
		if (raio < 0) throw new RuntimeException("Raio nao pode ser negativo");
		this.raio = raio;
	}
	
	// Methods
	public double area() {
		double raio = this.getRaio();
		
		double area = (raio*raio)*2*Math.PI;
		return area;
	}
}
