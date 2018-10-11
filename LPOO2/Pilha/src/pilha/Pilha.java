/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


Construir uma classe genérica de pilha (nome: Pilha) sem usar nenhuma
classe de Collection. Use o first-in – last-out (FILO). Sobrescreva o método toString()
para que imprima a lista no seguinte formato:
 */
package pilha;

import java.lang.reflect.Array;

/**
 *
 * @author Thiago
 * @param <T>
 */
public class Pilha<T> {
    private int tamanho = 10;
    private Object[] item;
    private int top;
    
    Pilha() {
        this.top = -1;
        this.item = new Object[this.tamanho];
    }
    
    public void empilha(T item) {
        if(this.top == this.tamanho) {
            return;
        }
        
        this.item[this.top+1] = item;
        this.top++;
    }
    
    public T desempilha(){
        return item();
    }
    
    @Override
    public String toString() {
        String result = "[ ";
        int range = this.top;
        while(range > -1) {
            result += this.item[range].toString();
            
            if (range > 0) {
                result +=  ", ";
            }
            
            range--;
        }
        
        result += " ]";
        return result;
    }
    
    private T item() {
        return (T)item[this.top--];
    }
}
