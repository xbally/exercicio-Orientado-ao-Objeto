/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author ronaldoniz
 */
public class Circunferencia {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea(Circunferencia c) {
        return Math.PI * Math.pow(c.getRaio(), 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}