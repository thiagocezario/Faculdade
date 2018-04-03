package locadora;


/**
* classe que calcula os lucros da locadora
* @author Thiago
*/
public class Locadora
{
	static float taxa = 1.1f;
	
	/* metodo principal que executa o programa
	*/
	
	/** Os argumentos de entrada sao numero de dvds na locadora e valor do aluguel	*/
	public static void main(String[] args)
	{
		float dvds = Float.parseFloat(args[0]);
		float valor = Float.parseFloat(args[1]);
		
		float aluguelMes = dvds/3.0f;
		
		float dvdsAtrasados = aluguelMes/10.0f;
		float valorMulta =(valor*0.1f);
		
		float faturamentoAnual = ((dvds/3.0f)*valor)*12.0f;
		System.out.printf("Faturamento anual: R$%.2f\n", faturamentoAnual);
		
		float multas = (dvdsAtrasados*valorMulta);
		System.out.printf("Lucro mensal com multas: R$%.2f\n", multas); 
		
	}
	
}