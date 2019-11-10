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
public class Circunferencia implements Superficie{
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }
    
    @Override
    public String toString(){
        return "Área da circunferência = " + area();
    }
}