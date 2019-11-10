package circuferencia;

import java.util.*;

public abstract class Circuferencia implements Superficie {
    public static void main(String args[]){
        UsaCircuferencia x = new UsaCircuferencia(3);
        Quadrado y = new Quadrado(2);
           
    System.out.println(x.Area());
    System.out.println(y.Area());
        
    }

}
