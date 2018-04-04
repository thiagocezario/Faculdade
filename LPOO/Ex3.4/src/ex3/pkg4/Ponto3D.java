/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
Crie uma classe para representar um Ponto3D, com atributos e
métodos (x, y, z, cor, intensidade). Crie os métodos gets e sets. Crie os
seguintes métodos:
a. public double caluclaDistancia(Ponto3D p) -> recebe como parâmetro
um ponto 3D, e retorna a distância entre o objeto específico e o ponto.
b. public static void main(String args[]) -> Criar uma nova classe chamada
UsaPonto3D e um método principal que faz testes utlizando a função
calculaDistancia

 */
package ex3.pkg4;

import java.util.Set;

/**
 *
 * @author Laboratório
 */
public class Ponto3D {
    double x = 0;
    double y = 0;
    double z = 0;
    String cor = "";
    String intensidade = "";
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getZ(){
        return z;
    }
    
    public String getCor(){
        return cor;
    }
    
    public String getIntensidade(){
        return intensidade;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }
    
    public double calculaDistancia(Ponto3D p){
        double distancia = 0;
        
        double x = Math.pow(p.x - this.x, 2);
        double y = Math.pow(p.y - this.y, 2);
        double z = Math.pow(p.z - this.z, 2);
        distancia = Math.sqrt(x + y + z);
        
        return distancia;
    }
}
