/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author Thiago
 */
public class UsaBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta();
        System.out.print("Bicicleta 1:\n");
        b.aumentarVelocidade(50);
        b.printStates();
        b.aplicarFreios(10);
        b.printStates();
        
        
        Bicicleta b2 = new Bicicleta() {
            @Override
            public void aplicarFreios(int decremento) {
                velocidade = velocidade - 2*decremento;
            }
        };
        
        System.out.print("Bicicleta 2:\n");
        b2.aumentarVelocidade(50);
        b2.printStates();
        b.aplicarFreios(10);
        b.printStates();
    }
    
}
