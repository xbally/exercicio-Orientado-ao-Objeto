import java.util.Scanner;

public class Nome {

	public static void main (String str[]) {
		System.out.println("Digite seu nome:");
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		String[] div = name.split(" ");
		for (int i = div.length - 1; i >= 0; i--) {
			System.out.println(div[i]);
		}
	}
}