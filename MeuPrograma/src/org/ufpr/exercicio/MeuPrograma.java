package org.ufpr.MeuPrograma;
        
class MeuPrograma {
 public static float som(float num1,float num2){
            return num1 + num2;
         }
     public static float sub(float num1,float num2){
            return num1 - num2;
     }
     public static float div(float num1,float num2){
           return num1 / num2;
     }
     public static float  mult(float num1,float num2){
           return num1 * num2;
     }
    public static void main(String nume[]) {
        float n1 = Float.parseFloat(nume[0]);
        float n2 = Float.parseFloat(nume[1]);
          switch(nume[2]){
            case "+" :  System.out.println(som(n1,n2));
                            break;
            case "-" :  System.out.println(sub(n1,n2));
                            break;
            case "/":   System.out.println(div(n1,n2));
                            break;
            case "x": System.out.println(mult(n1,n2));
                            break;
            default: System.out.println("Erro");
                            break;
            
        }
    }
    
}