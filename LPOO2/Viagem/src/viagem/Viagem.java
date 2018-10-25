/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viagem;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Viagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Distancia");
        String distancia = sc.next();
        System.out.println("Tempo");
        String tempo = sc.next();
        
        System.out.println("Distancia digitada: " + distancia);
        System.out.println("Tempo digitado: " + tempo + "\n\n\n");
        
        double t1 = Double.parseDouble(tempo);
        double d1 = Double.parseDouble(distancia);
        
        System.out.println("Distancia convertida pra double: " + d1);
        System.out.println("Tempo convertido pra double: " + t1 + "\n\n\n");
        
        String t = Double.toString(t1);
        String d = Double.toString(d1);
        
        System.out.println("Distancia convertida pra String: " + d);
        System.out.println("Tempo convertido pra String: " + t + "\n\n\n");
        
        BigDecimal tmp = new BigDecimal(t);
        BigDecimal dst = new BigDecimal(d);
        
        System.out.println("Distancia em BigDecimal: " + dst);
        System.out.println("Tempo em BigDecimal: " + tmp + "\n\n\n");
        
        tmp.setScale(3);
        dst.setScale(3);
        
        BigDecimal result = dst.divide(tmp, new MathContext(3, RoundingMode.UP));
        
        System.out.println("Velocidade media: " + result);
    }
    
}
