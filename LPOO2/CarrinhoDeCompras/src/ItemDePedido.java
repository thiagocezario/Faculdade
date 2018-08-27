
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
		
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
	}
	
	// Gets and Sets
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}

/*Escreva a estrutura de uma classe (atributos e métodos) para
representar um ItemDePedido (nome(String), preço(double),
quantidade(int)). Crie o construtor com validação para preço
negativo, descrição nula ou vazia e quantidade 0 ou negativa.
Crie os gets e sets (com as devidas validações).
b. Crie uma classe Pedido com o nome do cliente(Stri*/