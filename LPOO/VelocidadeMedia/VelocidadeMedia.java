class velocidadeMedia 
{
	public static void main (String[] args)
	{
		float dist = Float.parseFloat(args[0]);
		float tempo = Float.parseFloat(args[1]);
		float distSI = 0;
		float tempoSI = 0;
		
		distSI = converterDist(dist);
		tempoSI = converterTempo(tempo);
		
		System.out.printf("velMedia == %.2f", dist/tempo);
	}
	
	public static float converterDist(float dist)
	{
		return dist*1000;
	}
	
	public static float converterTempo(float tempo)
	{
		return tempo*3600;
	}
}