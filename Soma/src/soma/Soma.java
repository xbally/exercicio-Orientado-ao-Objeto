package soma;

import java.util.Scanner;


public class Soma {

  public static void main(String[] args) {
    String x = "";
    double total = 0;
    double num;
    int elem = 0;
    boolean flag = false;
        Scanner src = new Scanner(System.in);
        System.out.println("Digite Valores pra soma, Causa queira encerra inserção pressiona S");
while(!flag){
    try{
    x = src.nextLine();
    num = Double.parseDouble(x);
    total += num;
    elem++;
    }catch(NumberFormatException e){
        if("s".equals(x) || "S".equals(x)){
        flag = true;
        }else{
            System.out.println("Erro de entrada. \n" + x + " não é um numero válido. Tente novamente ou digite 'S' para sair.");
        }
    }
    }
        System.out.println("A soma dos números digitados é = " + total);
        System.out.println("A média dos números digitados é = " + total / elem);
        flag = true;
  }
    
}
