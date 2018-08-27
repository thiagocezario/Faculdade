import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemDePedidoTests {
	@Test
	public void ConstrutorTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		
		assertNotNull(item);
		assertEquals(nome, item.getNome());
		assertEquals(preco, item.getPreco(), 0.01);
		assertEquals(quantidade, item.getQuantidade());
	}
	
	@Test
	public void ConstrutorQuantiaZeroTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 0;
		
		assertThrows(RuntimeException.class, () -> new ItemDePedido(nome, preco, quantidade)); 
	}
	
	@Test
	public void ConstrutorQuantiaNegativaTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = -10;
		
		assertThrows(RuntimeException.class, () -> new ItemDePedido(nome, preco, quantidade)); 
	}
	
	@Test
	public void ConstrutorValorNegativoTest() {
		String nome = "Test";
		double preco = -2.15;
		int quantidade = 10;
		
		assertThrows(RuntimeException.class, () -> new ItemDePedido(nome, preco, quantidade)); 
	}
	
	@Test
	public void ConstrutorNomeNuloTest() {
		String nome = null;
		double preco = 2.15;
		int quantidade = 10;
		
		assertThrows(RuntimeException.class, () -> new ItemDePedido(nome, preco, quantidade)); 
	}
	
	@Test
	public void ConstrutorNomeVazioTest() {
		String nome = "";
		double preco = 2.15;
		int quantidade = 10;
		
		assertThrows(RuntimeException.class, () -> new ItemDePedido(nome, preco, quantidade)); 
	}
}
