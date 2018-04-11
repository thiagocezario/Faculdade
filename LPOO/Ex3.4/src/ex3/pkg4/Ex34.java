/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3.pkg4;

/**
 *
 * @author Laboratório
 */
public class Ex34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto3D p = new Ponto3D();
        Ponto3D q = new Ponto3D();
        UsaPontos3D usa = new UsaPontos3D();
        
        p.setX(1);
        p.setY(2);
        p.setZ(4);
        
        q.setX(4);
        q.setY(3);
        q.setZ(5);
        
        usa.testa(p, q);
    }
}
