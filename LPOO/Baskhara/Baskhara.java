class Baskhara
{
	public static void main (String[] args)
	{
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double delta = calcularDelta(a, b, c);
		
		calcularRaiz(delta, a, b);
	}
	
	public static double calcularDelta(double a, double b, double c)
	{
		double delta = (Math.pow(b, 2) - 4*a*c);
		double deltaRaiz = Math.sqrt(delta);
		
		return deltaRaiz;
	}
	
	public static void calcularRaiz(double delta, double a, double b)
	{
		double x1 = (-b+delta)/(2*a);
		
		System.out.printf("X1 == %.2f\n", x1);
		
		double x2 = (-b-delta)/(2*a);
		
		System.out.printf("X2 == %.2f\n", x2);
	}
}