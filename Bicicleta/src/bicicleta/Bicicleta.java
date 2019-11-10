package bicicleta;

class Bicicleta {

   private int cadencia = 0;
   private int velocidade = 0;
   private int marcha = 1;

    public Bicicleta(int cadencia, int velocidade, int marcha) {
        this.cadencia=cadencia;
        this.velocidade=velocidade;
        this.marcha=marcha;
    }
   
    
    void mudarCadencia(int novoValor) throws Exception {
       if(novoValor > 0 ){     
        cadencia = novoValor;
    }else{
           throw new Exception ("RPM Negativo");
       }
    }

    void mudarMarcha(int novoValor) throws Exception  {
     if(novoValor >= 0 && novoValor <= 24){   
        marcha = novoValor;
    }else{
           throw new Exception ("Marcha Invalida"); 
     }
    }

    void aumentarVelocidade(int incremento) throws Exception {
     if(velocidade + incremento <= 100){
        velocidade = velocidade + incremento;
    }else{
         throw new Exception ("Velocidade é acima de 100KM/h");
     }
    }

    void aplicarFreios(int decremento) throws Exception {
        if(velocidade - decremento > 0){
            velocidade = velocidade - decremento;
        }else{
            throw new Exception ("Valor negativo");
        }
    }
    
    public void setVelocidade(int velocidade) throws Exception {   
           if(velocidade > 0 && velocidade <=100){
                this.velocidade = velocidade;
           }else{
               throw new Exception ("Velocidades invalidas");
           }
    }
    
    void  printStates() {
        System.out.println("cadencia=" + cadencia + " velocidade=" + velocidade +        "marcha ="+marcha);
}

}
