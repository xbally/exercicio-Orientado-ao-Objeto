package media;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ronaldoniz
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c = "";
        double tot = 0, num = 0;
        int elem = 0;
        boolean flag = false;
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe os números na sequencia solicitada. \nPara sair digite 'S'");
        while (!flag) {
            try {
                c = scn.nextLine();
                num = Double.parseDouble(c);
                tot += num;
                elem++;
            } catch (NumberFormatException e) {
                if ("S".equals(c) || "s".equals(c)) {
                    flag = true;
                } else {
                    System.out.println("Erro de entrada. \n" + c + " não é um numero válido. Tente novamente ou digite 'S' para sair.");
                }
            }
        }
        System.out.println("A soma dos números digitados é = " + tot);
        System.out.println("A média dos números digitados é = " + tot / elem);
        flag = true;
    }
}
