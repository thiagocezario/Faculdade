/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author Laboratório
 */
public class UsaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        Circunferencia c2 = new Circunferencia();
        Circunferencia c3 = new Circunferencia();
        
        System.out.println("A área de c1 é: " + c1.calculaArea(10));
        System.out.println("A área de c2 é: " + c2.calculaArea(20));
        System.out.println("A área de c3 é: " + c3.calculaArea(3));
    }
    
}
