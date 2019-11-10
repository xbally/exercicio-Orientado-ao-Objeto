
import java.util.*;

public class Media {

    public static void main(String str[]) {

        double num = new double[], soma = 0;
        do {
            try {
                Scanner scn = new Scanner(System.in);
                System.out.println ("Informe um numero. Pressione 'S' para encerrar.");	
                num = scn.nextDouble();
            }
            catch (InputMismatchException e) {
                num = parse
            }
        } while ((num != 's') || (num != 'S'));

        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }

        System.out.println("A media dos números inseridos é " + soma);
    }
}
