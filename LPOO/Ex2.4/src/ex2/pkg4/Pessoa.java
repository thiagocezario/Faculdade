/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.pkg4;

/**
 *
 * @author Laboratório
 */
public class Pessoa {
    String nome = "";
    int idade = 0;
    String endereco = "";
    
    void fazAniversario() {
        idade += 1;
    }
    
    void imprime(){
        System.out.println(nome + " tem " + idade +
                " e mora no endereço " + endereco);
    }
}
