/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

import java.util.Scanner;

/**
 *
 * @author ronaldoniz
 */
public class UsaCircunferencia {
    public static void main(String[] args) {
    System.out.println("Defina o raio R da circunferencia: ");
    Scanner scn = new Scanner(System.in);
    double raio = scn.nextDouble();

    Circunferencia c = new Circunferencia(raio) {};
    System.out.println("A área é de " + c.calculaArea(c));
    }
}
