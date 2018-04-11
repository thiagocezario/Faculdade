import java.util.Scanner;

public class UseTemperature {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		int option = 0;
		double t = 0;
		
		do {
			System.out.println("1-Celsius to Farenheit\n"
					+ "2-Celsius to Kelvin\n"
					+ "3-Farenheit to Celsius\n"
					+ "4-Kelvin to Celsius\n"
					+ "0-Exit\n");
			option = read.nextInt();
			
			System.out.println("Enter the temperature:\n");
			t = read.nextDouble();
			
			switch (option) {
				case 1:
					System.out.println(t+" degrees celsius is " + 
							Temperature.convertToFarenheit(t) +
							" degrees farenheit\n");
					break;
				case 2:
					System.out.println(t+" degrees celsius is " +
							Temperature.convertToKelvin(t) +
							" degrees kelvin\n");
					break;
				case 3:
					System.out.println(t+" degrees farenheit is " +
							Temperature.convertCelsius(t, "F") +
							" degrees celsius\n");
					break;
				case 4:
					System.out.println(t + "degrees kelvin is " +
							Temperature.convertCelsius(t, "k") +
							" degrees celsius\n");
					break;
				default:
					break;
					
			}
		} while (option != 0);
	}
}
