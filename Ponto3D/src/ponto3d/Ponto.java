package ponto3d;

import java.util.*;

public class Ponto {
   
    public static void main(String[] args) {
        System.out.println("Defina os três pontos, X, Y e Z: ");
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        double z = scn.nextDouble();;
        double px = scn.nextDouble();
        double py = scn.nextDouble();
        double pz = scn.nextDouble();
        
        Ponto3D p = new Ponto3D(x, y, z) {};
        Ponto3D p1 = new Ponto3D(px, py, pz) {};
                   
        System.out.println("Valor é ,"+ p.distancia(p1));
         }
}

