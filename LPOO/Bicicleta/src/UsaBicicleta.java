
public class UsaBicicleta {
	public static void main (String[] args) {
		Bicicleta bike1 = new Bicicleta();
		Bicicleta bike2 = new Bicicleta(20);
		Bicicleta bike3 = new Bicicleta(10);
		
		System.out.println("Marcha atual da bicicleta 1: " + bike1.getMarcha());
		System.out.println("Numero de marchas da bicicleta 1: " + bike1.getTotalMarchas());
		bike1.setMarcha(3);
		
		System.out.println("Marcha atual da bicicleta 1: " + bike1.getMarcha() + "\n\n");
		
		System.out.println("Marcha atual da bicicleta 2: " + bike2.getMarcha());
		System.out.println("Numero de marchas da bicicleta 2: " + bike2.getTotalMarchas());
		bike2.setMarcha(15);
		
		System.out.println("Marcha atual da bicicleta 2: " + bike2.getMarcha() + "\n\n");
		
		System.out.println("Marcha atual da bicicleta 3: " + bike3.getMarcha());
		System.out.println("Numero de marchas da bicicleta 3: " + bike3.getTotalMarchas());
		bike3.setMarcha(24);
		
		System.out.println("Marcha atual da bicicleta 3: " + bike3.getMarcha() + "\n\n");
	}
}
