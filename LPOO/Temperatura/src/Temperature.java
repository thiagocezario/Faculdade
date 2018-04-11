import java.util.Objects;

public class Temperature {
	public static double convertCelsius(double t, String baseScale) {
		if (Objects.equals(baseScale, "F")) {
			return ((t - 32)*(5/9));
		}
		
		if (Objects.equals(baseScale, "K")) {
			return t - 273;
		}
		
		return 0;
	}
	
	public static double convertToFarenheit(double c) {
		return ((9*c)/5) + 32;
	}
	
	public static double convertToKelvin(double c) {
		return c + 273;
	}
}
