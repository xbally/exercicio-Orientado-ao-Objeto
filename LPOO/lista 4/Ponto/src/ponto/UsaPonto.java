/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto;

import java.util.*;

/**
 *
 * @author ronaldoniz
 */
public class UsaPonto {
    
    public static void main(String[] args) {
        System.out.println("Defina os três pontos, X, Y e Z: ");
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        double z = scn.nextDouble();;
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double z1 = scn.nextDouble();
        
        Ponto3D p = new Ponto3D(x, y, z) {};
        Ponto3D p1 = new Ponto3D(x1, y1, z1) {};
        System.out.println("A distância é de " + p.calculaDistancia(p1));
    }
}