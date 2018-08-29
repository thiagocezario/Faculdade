import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
	static List<Pedido> pedidos = new ArrayList<Pedido>();
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nomeCliente = "";
		String produto = "";
		double preco = 0;
		double valorPermitido = 0;
		int quantidade = 0;
		String opcao = "";
		Pedido pedido = null;
		ItemDePedido item = null;
		
		while (!opcao.equals("7")) {
			System.out.println("1 - Incluir pedido");
			System.out.println("2 - Excluir pedido por nome do cliente");
			System.out.println("3 - Listar pedidos");
			System.out.println("4 - Incluir item de pedido em Pedido");
			System.out.println("5 - Excluir item de pedido em Pedido");
			System.out.println("6 - Imprimir lista de pedidos");
			
			opcao = scn.next();
			
			switch(opcao) {
			case "1":
				System.out.println("Qual o nome do cliente?");
				nomeCliente = scn.next();
				System.out.println("Qual o valor permitido?");
				
				try {
					valorPermitido = scn.nextDouble();
					pedido = new Pedido(nomeCliente, valorPermitido);
					
				} catch (Exception e) { System.out.println(e);}
				
				incluirPedido(pedido);
				break;
			case "2":
				System.out.println("Qual o nome do cliente que deseja excluir o pedido?");
				nomeCliente = scn.next();
				
				excluirPedido(nomeCliente);
				break;
			case "3":
				System.out.println("Qual o nome do cliente que deseja listar o pedido?");
				nomeCliente = scn.next();
				listarPedidos(nomeCliente);
				break;
			case "4":
				System.out.println("Qual o nome do cliente?");
				nomeCliente = scn.next();
				
				System.out.println("Qual o item?");
				String prod = scn.next();
				
				System.out.println("Qual o preço?");
				
				try {
					preco = scn.nextDouble();
					
					System.out.println("Quantos itens?");
					quantidade = scn.nextInt();
					item = new ItemDePedido(prod, preco, quantidade);
					
				} catch (Exception e) { System.out.println(e); }

				for (Pedido i : pedidos) {
					if (i.getCliente().equals(nomeCliente)) {
						incluirItem(i, item);
						break;
					}
				}
				
				break;
			case "5":
				System.out.println("Qual o nome do cliente?");
				nomeCliente = scn.next();
				
				System.out.println("Qual o produto?");
				produto = scn.next();
				
				for (Pedido it : pedidos) {
					if (it.getCliente().equals(nomeCliente)) {
						excluirItem(it, produto);
						break;
					}
				}
				break;
			case "6":
				imprimirLista();
				break;
			case "7":
				System.out.println("Encerrando...");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
	
	public static void incluirPedido(Pedido pedido) {
		pedidos.add(pedido);	
	}
	
	public static void excluirPedido(String cliente) {
		try {
			for(Pedido pedido : pedidos) {
				if(pedido.getCliente().equals(cliente)) {
					pedidos.remove(pedido);
					return;
				}
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void listarPedidos(String cliente) {
		if (pedidos != null && pedidos.size() > 0) {
			for(Pedido pedido : pedidos) {
				if (pedido.getCliente().equals(cliente)) {
					System.out.println(pedido.toString());
					return;
				}
			}
			System.out.println("Pedido não encontrado na lista");
		}
	}
	
	public static void incluirItem(Pedido pedido, ItemDePedido item) {
		try {
			pedido.acrescentaItem(item);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void excluirItem(Pedido pedido, String item) {
		if (pedidos != null && pedidos.size() > 0) {
			try {
				pedido.retiraItem(item);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void imprimirLista() {
		if (pedidos != null && pedidos.size() > 0) {
			for(int i = 0; i < pedidos.size(); i++) {
				System.out.println("Pedido " + (i + 1));
				Pedido pedido = pedidos.get(i);
				System.out.println(pedido.toString());
			}
		}
	}
}