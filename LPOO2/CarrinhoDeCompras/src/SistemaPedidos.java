import java.util.List;
import java.util.Scanner;

public class SistemaPedidos {
	static List<Pedido> pedidos;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("1 - Incluir pedido");
		System.out.println("2 - Excluir pedido por nome do cliente");
		System.out.println("3 - Listar pedidos");
		System.out.println("4 - Incluir item de pedido em Pedido");
		System.out.println("5 - Excluir item de pedido em Pedido");
		System.out.println("6 - Imprimir lista de pedidos");
		
		String opcao = scn.next();
		
		switch(opcao) {
		case "1":
			incluirPedido();
			break;
		case "2":
			excluirPedido();
			break;
		case "3":
			listarPedidos();
			break;
		case "4":
			incluirItem();
			break;
		case "5":
			excluirItem();
			break;
		case "6":
			imprimirLista();
			break;
		default:
			break;
		}
	}
	
	public static void incluirPedido() {
		
	}
	
	public static void excluirPedido() {
		
	}
	
	public static void listarPedidos() {
		
	}
	
	public static void incluirItem() {
		
	}
	
	public static void excluirItem() {
		
	}
	
	public static void imprimirLista() {
		if (pedidos != null && pedidos.size() > 0) {
			for(int i = 0; i < pedidos.size(); i++) {
				System.out.println("Pedido " + (i + 1));
				Pedido pedido = pedidos.get(i);
				pedido.toString();
			}
		}
	}
}

/*Crie uma outra classe (SistemaPedidos) que utilize objetos do tipo
Pedido. Nessa classe instancie uma lista de Pedidos que armazene os
pedidos criados. Crie um menu com as seguintes opções: 1 – Incluir
Pedido, 2 – Excluir pedido por nome do cliente, 3 – Listar Pedidos, 4 –
Incluir Item de Pedido em Pedido, 5 – Excluir Item de Pedido em Pedido,
6 – Imprimir a lista de Pedidos. Cada um destes itens do menu deve ter
um método associado.
*/