import java.util.*;

public class Chuva {

	public static void main(String str[]) {

		int soma = 0;
		float num[] = new float[7];
		Scanner scn = new Scanner (System.in);
		for (int i = 0; i < 7; i++) {
			System.out.println ("Insira o indice do dia " + (i + 1));
			num[i] = scn.nextFloat();
			soma += num[i];
		}

		float maior = num[0];
		float menor = num[0];
		int a = 0, b = 0;
		for (int j = 0;j < 7;j++) {
			if (num[j] > maior) {
				maior = num[j];
				a = j;
			}
			else if (num[j] < menor) {
				menor = num[j];
				b = j;
			}
		}
		
		System.out.println("Media pluviometrica: " + soma/7 + " mm.");
		System.out.println("O maior indice foi de " + maior + " mm no dia " + (a + 1));
		System.out.println("O menor indice foi de " + menor + " mm no dia " + (b + 1));
	}
}