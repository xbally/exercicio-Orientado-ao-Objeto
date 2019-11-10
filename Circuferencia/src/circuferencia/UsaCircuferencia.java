package circuferencia;

import static java.lang.Math.PI;

public  class UsaCircuferencia implements Superficie{
   private double raio;

    public UsaCircuferencia(double raio) {
        this.raio = raio;
     }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double Area() {
        return Math.PI * Math.pow(this.raio, 2);
    }
    
    @Override
    public String toString(){
        return "Área da circunferência = " + Area();
    }
}
