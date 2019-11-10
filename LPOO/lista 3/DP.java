
import java.util.*;

public class DP {

    public static void main(String str[]) {

        int qtde, i;
        double somaMed = 0, somatoria = 0;
        System.out.println("Insira o total de amostras:");
        Scanner scn = new Scanner(System.in);
        qtde = scn.nextInt();
        double amostras[] = new double[qtde];
        for (i = 0; i < amostras.length; i++) {
            System.out.println("Insira a amostra " + (i + 1));
            amostras[i] = scn.nextDouble();
            somaMed += amostras[i];
        }
        for(i = 0; i < amostras.length; i++) {
            somatoria += Math.pow((amostras[i] - (somaMed / qtde)), 2); 
        }
        System.out.println("O desvio padrão das amostras é igual a " + Math.sqrt(somatoria / (qtde - 1)));
    }
}
