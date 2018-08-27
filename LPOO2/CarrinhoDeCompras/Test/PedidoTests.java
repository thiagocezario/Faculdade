import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PedidoTests {
	@Test
	public void ConstrutorTest() {
		String nomeCliente = "Arildo";
		double valorTotalPermitido = 50.00;
		
		Pedido pedido = new Pedido(nomeCliente, valorTotalPermitido);
		
		assertNotNull(pedido);
		assertEquals(nomeCliente, pedido.nomeCliente);
		assertEquals(valorTotalPermitido, pedido.valorPermitido, 0.01);
	}
	
	@Test
	public void ConstrutorNomeVazioTest() {
		String nomeCliente = "";
		double valorTotalPermitido = 50.00;
		
		assertThrows(RuntimeException.class, () -> new Pedido(nomeCliente, valorTotalPermitido));
	}
	
	@Test
	public void ConstrutorNomeNuloTest() {
		String nomeCliente = null;
		double valorTotalPermitido = 50.00;
		
		assertThrows(RuntimeException.class, () -> new Pedido(nomeCliente, valorTotalPermitido));
	}
	
	@Test
	public void ConstrutorValorNegativoTest() {
		String nomeCliente = "Arildo";
		double valorTotalPermitido = -50.00;
		
		assertThrows(RuntimeException.class, () -> new Pedido(nomeCliente, valorTotalPermitido));
	}
	
	@Test
	public void getClienteTest() {
		String nomeCliente = "Teste";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		
		assertEquals(nomeCliente, pedido.getCliente());
	}
	
	@Test
	public void getCliente2Test() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		
		assertEquals(nomeCliente, pedido.getCliente());
	}
	
	@Test
	public void getItensListaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		
		List<ItemDePedido> listaEsperada = new ArrayList<ItemDePedido>();
		listaEsperada.add(new ItemDePedido("OMO", 1.15, 2));
		
		ItemDePedido novoItem = new ItemDePedido("OMO", 1.15, 2);
		pedido.itens.add(novoItem);
		
		List<ItemDePedido> listaAtual = pedido.getItens();
		
		assertNotNull(listaAtual);
		assertTrue(listaAtual.size() > 0);
	}
	
	@Test
	public void getItensListaVaziaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		
		List<ItemDePedido> listaEsperada = new ArrayList<ItemDePedido>();		
		List<ItemDePedido> listaAtual = pedido.getItens();
		
		assertEquals(listaEsperada, listaAtual);
	}
	
	@Test
	public void adicionaItemListaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		ItemDePedido novoItem = new ItemDePedido("OMO", 2.15, 2);
		
		pedido.acrescentaItem(novoItem);
		List<ItemDePedido> lista = pedido.getItens();
		boolean resultadoEsperado = lista.contains(novoItem);
		
		assertEquals(true, resultadoEsperado);
	}
	
	@Test
	public void adicionaItemNuloTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		
		assertThrows(RuntimeException.class, () -> pedido.acrescentaItem(null));
	}
	
	@Test
	public void adicionaItemAcimaDoValorTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		ItemDePedido novoItem = new ItemDePedido("OMO", 10.15, 2);
		
		assertThrows(RuntimeException.class, () -> pedido.acrescentaItem(novoItem));
	}
	
	@Test
	public void adicionaItemValorZeroTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 0;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		ItemDePedido novoItem = new ItemDePedido("OMO", 10, 2);
		
		assertThrows(RuntimeException.class, () -> pedido.acrescentaItem(novoItem));
	}
	
	@Test
	public void adicionaItemRepetidoTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		ItemDePedido novoItem = new ItemDePedido("OMO", 2.15, 2);

		List<ItemDePedido> listaEsperada = new ArrayList<ItemDePedido>();
		listaEsperada.add(new ItemDePedido("OMO", 2.15, 4));
		
		pedido.acrescentaItem(novoItem);
		pedido.acrescentaItem(novoItem);
		
		List<ItemDePedido> listaAtual = pedido.getItens();
		
		ItemDePedido itemEsperado = listaEsperada.get(0);
		ItemDePedido itemAtual = listaAtual.get(0);
		
		assertTrue(itemAtual != null);
		assertTrue(itemAtual.getQuantidade() == itemEsperado.getQuantidade());
		//assertEquals(itemEsperado, itemAtual);
	}
	
	@Test
	public void removeItemListaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		ItemDePedido item1 = new ItemDePedido("OMO", 2.15, 2);
		ItemDePedido item2 = new ItemDePedido("SABONETE", 0.15, 5);

		List<ItemDePedido> listaEsperada = new ArrayList<ItemDePedido>();
		listaEsperada.add(new ItemDePedido("OMO", 2.15, 4));
		
		pedido.acrescentaItem(item1);
		pedido.acrescentaItem(item2);
		
		pedido.retiraItem("SABONETE");
		
		List<ItemDePedido> listaAtual = pedido.getItens();
		
		assertTrue(listaAtual.size() == 1);
		assertTrue(listaAtual != null);
		//assertEquals(listaEsperada.get(0), listaAtual.get(0));
	}
	
	@Test
	public void removeItemListaVaziaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		assertThrows(RuntimeException.class, () -> pedido.retiraItem("SABONETE"));
	}
	
	@Test
	public void getTotalListaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		ItemDePedido item1 = new ItemDePedido("OMO", 2, 2);
		ItemDePedido item2 = new ItemDePedido("SABONETE", 1, 5);
		
		pedido.acrescentaItem(item1);
		pedido.acrescentaItem(item2);
		
		double valorAtual = pedido.getTotal();
		double valorEsperado = 9;
		
		assertEquals(valorEsperado, valorAtual);
	}
	
	@Test
	public void getTotalListaVaziaTest() {
		String nomeCliente = "Joaquim";
		double valorPermitido = 10;
		
		Pedido pedido = new Pedido(nomeCliente, valorPermitido);
		double valorAtual = pedido.getTotal();
		double valorEsperado = 0;
		
		assertEquals(valorEsperado, valorAtual);
	}
}
/*

vi. String toString(): método que retorna uma String de forma
legível para o pedido:
*/