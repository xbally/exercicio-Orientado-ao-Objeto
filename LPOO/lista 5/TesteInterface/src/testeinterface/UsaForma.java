/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

import java.util.Scanner;

/**
 *
 * @author ronaldoniz
 */
public class UsaForma {
    public static void main(String[] args) {
    System.out.println("Defina o raio da circunferencia: ");
    Scanner scn = new Scanner(System.in);
    double raio = scn.nextDouble();
    System.out.println("Defina o lado do quadrado: ");
    double lado = scn.nextDouble();

    Circunferencia c = new Circunferencia(raio);
    Quadrado q = new Quadrado(lado);
    System.out.println("A area da circunferencia e de " + c.area());
    System.out.println("A area do quadrado e de " + q.area());
    
    }
}