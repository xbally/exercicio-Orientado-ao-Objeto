
import java.util.Scanner;

public class Dp {
        
 
    public static void main(String[] args) {
       int linha;
       int coluna;
       System.out.println("Digite quantidades de linhas para matriz");
       Scanner aux = new Scanner(System.in);
       linha = aux.nextInt();
       System.out.println("Digite quantidade de colunas para matriz");
       Scanner aux1 = new Scanner(System.in);
       coluna = aux1.nextInt();
       {
           int matriz[][] = new int[linha][coluna];
               PreencheMatriz(matriz); 
               
                System.out.println("Soma da diagonal principal = " + DiagonalPrimario(matriz));
                System.out.println("Soma da diagonal principal = " + DiagonalSegundario(matriz));
       }
       
    }
    
    public static void PreencheMatriz(int matriz[][])
    {
         int linha;
         int coluna;
         for(linha=0; linha < matriz.length; linha++){
         for(coluna=0; coluna < matriz.length ; coluna++){
                System.out.println("Digita valor para linha " + (linha +1) + " e coluna" + (coluna+1));
                       Scanner aux = new Scanner(System.in);
                       matriz[linha][coluna] = aux.nextInt();
                }
            }
         }
        
    public static int DiagonalPrimario(int matriz[][])
{
        int linha;
        int coluna;
        int soma=0;
        int n;
            for(linha=0; linha < matriz.length; linha++){
            for(coluna=0; coluna<matriz[0].length; coluna++){
                if(linha==coluna){
                   {
                        soma += matriz[linha][coluna];
                        }                  
                    }
                }
            }        
      return soma;    
    }
    
   public static int DiagonalSegundario(int matriz[][])
{
        int linha;
        int coluna;
        int soma=0;
        int n;
            for(linha=0; linha < matriz.length; linha++){
            for(coluna=0; coluna<matriz[0].length; coluna++){
                    if ((linha + coluna) == (matriz[linha].length - 1)) {
                    soma += matriz[linha][coluna];
                         }             
                    }
                }
              return soma; 
         }            
}