import java.util.ArrayList;
import java.util.List;

public class Pedido {
	// Properties
	String nomeCliente;
	List<ItemDePedido> itens;
	double valorPermitido;
	
	// Constructor
	public Pedido(String nomeCliente, double valorPermitido) throws RuntimeException{
		if (nomeCliente == null || nomeCliente.isEmpty()) {
			throw new RuntimeException("Nome invalido");
		}
		
		if (valorPermitido < 0) {
			throw new RuntimeException("Valor maximo permitido invalido");
		}
		
		this.nomeCliente = nomeCliente;
		this.valorPermitido = valorPermitido;
		this.itens = new ArrayList<>();
	}
	
	// Gets and Sets
	public String getCliente() {
		return this.nomeCliente;
	}
	
	public List<ItemDePedido> getItens(){
		return this.itens;
	}
	
	// Methods
	public void acrescentaItem(ItemDePedido item) throws RuntimeException{
		if (item == null) {
			throw new RuntimeException("Item invalido");
		}
		
		if (item.getPreco() * item.getQuantidade() > this.valorPermitido) {
			throw new RuntimeException("Item pedido não incluido. Valor do pedido excedido");
		}
		
		if (this.itens.contains(item)) {
			for(ItemDePedido i : this.itens) {
				i.setQuantidade(i.getQuantidade() + item.getQuantidade());
			}
		} else {
			this.itens.add(item);
		}
	}
	
	public void retiraItem(String item) throws RuntimeException{
		boolean removeuItem = false;
		if (item != null) {
			for(ItemDePedido i : this.itens) {
				if (i.getNome().equals(item)) {
					this.itens.remove(i);
					removeuItem = true;
					break;
				}
			}
		}
		
		if(!removeuItem) {
			throw new RuntimeException("Item nao encontrado");
		}
	}
	
	public double getTotal() {
		double total = 0;
		
		for (ItemDePedido item : this.itens) {
			total += item.getPreco() * item.getQuantidade();
		}
		
		return total;
	}
	
	public String toString() {
		String str = "-------------------------------------"
				   + "\nNome do Cliente: " + this.nomeCliente
				   + "\nTotal do Pedido: R$" + this.getTotal()
				   + "\nItem              | Preço";
		
		for(ItemDePedido item : this.itens) {
			str += "\n" + item.getNome() + "        |R$" + item.getPreco();
		}
		
		str += "\n-------------------------------------";
		
		return str;
	}
}
