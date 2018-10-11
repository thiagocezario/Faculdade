/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author Thiago
 */
public class Circunferencia implements Superficie {
    public double raio;
    
    public Circunferencia (double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        return Math.pow(this.raio, 2)*Math.PI;
    }
}
