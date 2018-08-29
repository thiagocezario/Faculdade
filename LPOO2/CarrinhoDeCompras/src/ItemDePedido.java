
public class ItemDePedido {
	// Properties
	private String nome;
	private double preco;
	private int quantidade;
	
	// Constructor
	public ItemDePedido(String nome, double preco, int quantidade) throws RuntimeException{
		if (nome.isEmpty() || nome == null) {
			throw new RuntimeException("Nome do produto invalido");
		}
		
		if (preco < 0) {
			throw new RuntimeException("Preço invalido");
		}
		
		if (quantidade < 1) {
			throw new RuntimeException("Quantidade inválida");
		}
		
		try {
			this.setNome(nome);
			this.setPreco(preco);
			this.setQuantidade(quantidade);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// Gets and Sets
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) throws RuntimeException {
		if (nome.isEmpty() || nome == null) {
			throw new RuntimeException("Nome do produto invalido");
		}
		
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) throws RuntimeException {
		if (preco < 0) {
			throw new RuntimeException("Preço invalido");
		}
		
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) throws RuntimeException {
		if (quantidade < 1) {
			throw new RuntimeException("Quantidade inválida");
		}
		
		this.quantidade = quantidade;
	}
}