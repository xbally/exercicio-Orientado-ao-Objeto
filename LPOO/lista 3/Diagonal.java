
import java.util.*;

public class Diagonal {

    public static int diagonalPrincipal(int matriz[][]) {

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static int diagonalSecundaria(int matriz[][]) {
        
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i + j) == (matriz[i].length - 1)) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static void preencheMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Scanner scn = new Scanner(System.in);
                System.out.println("Elemento da linha " + (i + 1) + " e coluna " + (j + 1) + ": ");
                int x = scn.nextInt();
            }
        }
    }

    public static void main(String str[]) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Quantidade de linhas da matriz:");
        int x = scn.nextInt();
        System.out.println("Quantidade de colunas da matriz:");
        int y = scn.nextInt();
        int mat[][] = new int[x][y];
        preencheMatriz(mat);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(mat[i][j]);
            }
        }

        System.out.println("Soma da diagonal principal = " + diagonalPrincipal(mat));
        System.out.println("Soma da diagonal secundaria = " + diagonalSecundaria(mat));
    }
}
