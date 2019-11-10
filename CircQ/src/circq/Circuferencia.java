package circq;

import static java.lang.ProcessBuilder.Redirect.to;


public abstract class Circuferencia implements Superficie{
        private Circuferencia[] valor;
        private double raio;

    public Circuferencia(Circuferencia[] valor, double raio) {
        this.valor = valor;
        this.raio = raio;
    }

    public Circuferencia[] getValor() {
        return valor;
    }

    public void setValor(Circuferencia[] valor) {
        this.valor = valor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double Area(){
        return Math.PI *Math.pow(this.raio, 2);
}    

    @Override
    public String toString() {
        return "A area é = " + Area();
    }

   
}