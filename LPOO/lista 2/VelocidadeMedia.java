import java.util.Scanner;

public class VelocidadeMedia {

	public static void main (String[] str) {
		System.out.println("Digite a distancia:");
		Scanner scn = new Scanner(System.in);
		float dist = scn.nextFloat();
		System.out.println("Digite o tempo:");
		Scanner scan = new Scanner(System.in);
		float t = scan.nextFloat();
		System.out.printf ("Velocidade media: %.2fkm/h", dist/t);
	}
}