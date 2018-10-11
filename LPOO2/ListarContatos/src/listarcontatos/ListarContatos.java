/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontatos;

import DAO.Contato;
import DAO.ContatoDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class ListarContatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        Contato contato = new Contato();
        Scanner scn = new Scanner(System.in);
        
        while(opcao != 5) {
            try {
                System.out.println("Escolha uma opcao:");
                System.out.println("1) Inserir");
                System.out.println("2) Remover");
                System.out.println("3) Alterar");
                System.out.println("4) Listar");
                
                opcao = scn.nextInt();
                
                switch (opcao) {
                    case 1:
                        System.out.println("Insira as informações do contato para inserir:");
                        System.out.println("ID");
                        contato.setId(scn.nextInt());
                        
                        System.out.println("Nome");
                        contato.setNome(scn.next());
                        scn.nextLine();
                        System.out.println("Endereço");
                        contato.setEndereco(scn.next());
                        scn.nextLine();
                        System.out.println("Telefone");
                        contato.setTelefone(scn.next());
                        scn.nextLine();
                        ContatoDAO.insere(contato);
                        break;
                    case 2:
                        System.out.println("Insira a ID do contato para remover:");
                        contato.setId(scn.nextInt());
                        
                        ContatoDAO.remove(contato);
                        break;
                    case 3:
                        System.out.println("Insira a ID do contato para alterar:");
                        System.out.println("ID");
                        contato.setId(scn.nextInt());
                        
                        System.out.println("Insira as novas informações:");
                        System.out.println("Nome");
                        contato.setNome(scn.nextLine());
                        scn.nextLine();
                        System.out.println("Endereço");
                        contato.setEndereco(scn.nextLine());
                        scn.nextLine();
                        System.out.println("Telefone");
                        contato.setTelefone(scn.nextLine());
                        scn.nextLine();
                        
                        ContatoDAO.altera(contato);
                        break;
                    case 4:
                        List<Contato> lista = ContatoDAO.lista();
                        
                        if (!lista.isEmpty() && lista != null) {
                            for (Contato c : lista) {
                                System.out.println("----------------------");
                                System.out.println("ID: " + c.getId());
                                System.out.println("Nome: " + c.getNome());
                                System.out.println("Endereço: " + c.getEndereco());
                                System.out.println("Telefone: " + c.getTelefone());
                                System.out.println("----------------------");
                            }
                        }
                        
                        break;
                    default:
                        System.err.println("Valor invalido");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
