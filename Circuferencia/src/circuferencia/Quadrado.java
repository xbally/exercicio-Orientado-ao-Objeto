package circuferencia;

/**
 *
 * @author gabri
 */
public  class Quadrado implements Superficie {
           private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public double Area() {
        return Math.pow(this.lado, 2);
            }
    
    @Override
    public String toString(){
        return "Área do quadrado = " + Area();
    }

}

