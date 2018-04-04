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
public class Circunferencia {
    double raio = 0;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea(double raio){
        double area = Math.PI * Math.pow(raio, 2);
        
        return area;
    }
}
