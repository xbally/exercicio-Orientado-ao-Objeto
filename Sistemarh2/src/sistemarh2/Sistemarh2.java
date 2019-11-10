package sistemarh2;

import java.util.Scanner;


public class Sistemarh2 {


    public static void main(String[] args) {
     //    public funcionario(double salario, boolean ativo, String nome, String rg) {   
    // try{
     System.out.println("Programa de registro");
        System.out.println("Registro de gerente");
            Scanner src = new Scanner(System.in);
                                    System.out.println("Salario");
                                    double salario = src.nextDouble(); 
                                    System.out.println("Nome");
                                    String name = src.next();
                                    System.out.println("RG");
                                    String RG = src.next();
                                    gerente x = new gerente(salario , true, name, RG);
                                    funcionario [] funcionarios = new funcionario[2];
                                    funcionarios[0] = x; 
                                    String relatorio = getRelatorio(funcionarios);
                                    System.out.println(relatorio);
                       }
              //  catch(NumberFormatException  erro){
                   // System.out.println("Ocorreu erro, Valor da variavel é double" + erro);
              //  }
              //  catch(Exception  e){
                 //   System.out.println("Ocorreu erro , Valor da String" + e);
                //}
                //finally{
                        
       
                //}
     
  
     public static String getRelatorio(funcionario[] funcionarios){
         String relatorio = "nome;salario;rg;ativo\n";
            for(funcionario f:funcionarios){
                if(f instanceof gerente){
                    gerente g = (gerente)f;
                }
               relatorio += f.toString()+"\n";
        }
         return relatorio;
     }
      }
