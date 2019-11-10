package retangulo;

public class Retangulo {
    private double base;
    private double altura;

 public Retangulo(double area, double altura) throws IllegalArgumentException{
     if(base > 0 && altura >0){
         this.base = base;
         this.altura = altura;      
     }else{
         throw new IllegalArgumentException("Argumentos são Inferiores a 0 ");
     }
 }
  
    
}
