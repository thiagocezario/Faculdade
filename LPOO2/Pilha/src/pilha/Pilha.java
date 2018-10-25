/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


Construir uma classe genérica de pilha (nome: Pilha) sem usar nenhuma
classe de Collection. Use o first-in – last-out (FILO). Sobrescreva o método toString()
para que imprima a lista no seguinte formato:
 */
package pilha;

/**
 *
 * @author Thiago
 * @param <T>
 */
public class Pilha<T> {
    private No pilha;
    private int topo;
    
    class No{
        T elemento;
        No proximo;
    }
    
    Pilha() {
        this.topo = -1;
        this.pilha = new No();
    }
    
    public void empilha(T item) {
        No anterior = this.pilha;
        this.pilha = new No();
        this.pilha.elemento = item;
        this.topo++;
        this.pilha.proximo = anterior;
    }
    
    public T desempilha(){
        if (this.topo < 0) {
            return null;
	}
	this.topo--;
	T valor = this.pilha.elemento;
        this.pilha = this.pilha.proximo;
        
        return valor;
    }
    
    @Override
    public String toString() {
        String result = "";
        for (No p = this.pilha; p.proximo != null; p = p.proximo) {
            result += p.elemento.toString();
            
            if (p.proximo.elemento != null) {
                result += ", ";
            }
        }
        
        return "[ " + result + " ]";
    }
}
