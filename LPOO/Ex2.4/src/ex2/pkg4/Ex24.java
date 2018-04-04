/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg4;
import java.util.Scanner;


/**
 *
 * @author Laboratório
 */
public class Ex24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Insira o nome da pessoa: ");
        pessoa.nome = read.nextLine();
        System.out.println("Insira a idade da pessoa: ");
        pessoa.idade = read.nextInt();
        System.out.println("Insira o endereço da pessoa: ");
        read.nextLine();
        pessoa.endereco = read.nextLine();
        
                
                
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        
        pessoa.imprime();
    }
}
