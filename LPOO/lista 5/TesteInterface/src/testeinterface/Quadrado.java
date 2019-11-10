/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

/**
 *
 * @author ronaldoniz
 */
public class Quadrado implements Superficie {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area() {
        return Math.pow(this.lado, 2);
    }
    
    @Override
    public String toString(){
        return "Área do quadrado = " + area();
    }
}
