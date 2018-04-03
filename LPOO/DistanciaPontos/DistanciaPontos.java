class DistanciaPontos
{
	public static void main(String[] args)
	{
		double xa = Double.parseDouble(args[0]);
		double ya = Double.parseDouble(args[1]);
		double xb = Double.parseDouble(args[2]);
		double yb = Double.parseDouble(args[3]);
		
		System.out.println("A distancia entre os pontos (" + xa + ", " + ya + ") e (" + xb + ", " + yb + ") eh " + raiz(xa, ya, xb, yb));
	}
	
	public static double quadrado(double pontoA, double pontoB)
	{
		double subtracao = pontoB - pontoA;
		double potencia = Math.pow(subtracao, 2);
		
		return potencia;
	}
	
	public static double raiz(double xa, double ya, double xb, double yb)
	{
		double x = quadrado(xa, xb);
		double y = quadrado(ya, yb);
		
		double xy = x + y;
		
		double distancia = Math.sqrt(xy);
		
		return distancia;
	}
}