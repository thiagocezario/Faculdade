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
	
	@Test
	public void GetNomeTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		String atual = item.getNome();
		
		assertEquals(nome, atual);
	}
	
	@Test
	public void GetPrecoTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		double atual = item.getPreco();
		
		assertEquals(preco, atual);
	}
	
	@Test
	public void GetQuantidadeTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		
		int atual = item.getQuantidade();
		
		assertEquals(quantidade, atual);
	}
	
	@Test
	public void SetNomeTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		String esperado = "Mudou";
		item.setNome(esperado);
		String atual = item.getNome();
		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void SetNomeVazioTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		String esperado = "";
		assertThrows(RuntimeException.class, () -> item.setNome(esperado));
	}
	
	@Test
	public void SetNomeNullTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		String esperado = null;
		assertThrows(RuntimeException.class, () -> item.setNome(esperado));
	}
	
	@Test
	public void SetPrecoTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		double esperado = 4.58;
		item.setPreco(esperado);
		double atual = item.getPreco();
		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void SetPrecoFailTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		double esperado = -4.58;
		assertThrows(RuntimeException.class, () -> item.setPreco(esperado));
	}
	
	@Test
	public void SetQuantidadeTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		int esperado = 3;
		item.setQuantidade(esperado);
		int atual = item.getQuantidade();
		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void SetQuantidadeFailTest() {
		String nome = "Test";
		double preco = 2.15;
		int quantidade = 5;
		ItemDePedido item = new ItemDePedido(nome, preco, quantidade);
		int esperado = -3;
		assertThrows(RuntimeException.class, () -> item.setQuantidade(esperado));
	}
}
