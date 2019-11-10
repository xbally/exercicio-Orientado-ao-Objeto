/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo2;

/**
 *
 * @author ronaldoniz
 */
public class Retangulo2 {

    private double largura;
    private double altura;

    public Retangulo2(double largura, double altura) throws IllegalArgumentException {
        if (largura > 0 && altura > 0) {
            this.largura = largura;
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Lados inválidos");
        }
    }
}
