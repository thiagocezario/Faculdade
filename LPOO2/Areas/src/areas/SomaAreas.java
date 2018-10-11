/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

import java.util.List;

/**
 *
 * @author Thiago
 */
public class SomaAreas {
    public double calculaArea(List<? extends Superficie> formas) {
        double soma = 0;
        
        for(Superficie s : formas) {
            soma += s.area();
        }
        
        return soma;
    }
}
