class Bicicleta {
	private int cadencia = 0;
	private int velocidade = 0;
	private int marcha = 1;
	private int totalMarchas = 1;
	
	public int getTotalMarchas() {
		return totalMarchas;
	}

	public void setTotalMarchas(int totalMarchas) {
		this.totalMarchas = totalMarchas;
	}

	public Bicicleta() {
		this.totalMarchas = 18;
		this.velocidade = 0;
	}
	
	public Bicicleta(int marchas) {
		this.totalMarchas = marchas;
		this.velocidade = 0;
	}
	
	public void mudarCadencia(int novoValor){
		cadencia = novoValor;
	}
	
	public void mudarMarcha(int novoValor){
		if (novoValor <= totalMarchas) {
			marcha = novoValor;
		}
	}
	
	public void aumentarVelocidade(int incremento){
		velocidade = velocidade + incremento;
	}
	
	public void aplicarFreios(int decremento){
		velocidade = velocidade - decremento;
	}
	
	public void printStates(){
		System.out.println("cadencia="+cadencia+
				" velocidade="+velocidade+"marcha="+marcha);
	}

	public int getCadencia() {
		return cadencia;
	}

	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
}