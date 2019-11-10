import java.util.Scanner;

public class Funcionarios {
	public static void main (String[] args) {
		System.out.println("Qual o cargo do funcionario?");
		System.out.println("\n1 - Diretor");
		System.out.println("\n2 - Gerente");
		System.out.println("\n3 - Analista");
		System.out.println("\n4 - Programador");
		System.out.println("\n5 - Auxiliar de Limpeza");
		Scanner scn = new Scanner(System.in);
		int opt = scn.nextInt();
		System.out.println("Digite o salario:");
		Scanner scan = new Scanner(System.in);
		float sal = scan.nextFloat();
		switch (opt) {
			case 1:	System.out.println("Quantos departamentos sao gerenciados?");
						Scanner scn1 = new Scanner(System.in);
						int dept = scn.nextInt();
						System.out.printf("Bonus anual: R$%.2f", (4*sal) + (3000*dept));
						break;
			case 2:	System.out.printf("Quantas pessoas sao gerenciadas?");
						Scanner scn2 = new Scanner(System.in);
						int per = scn.nextInt();
						System.out.printf("Bonus anual: R$%.2f", (2*sal) + (100*per));
						break;
			case 3:	System.out.printf("Bonus anual: R$%.2f", sal);
						break;
			case 4:	System.out.printf("Bonus anual: R$%.2f", 0.8*sal);
						break;
			case 5:	System.out.printf("Bonus anual: R$%.2f", 0.5*sal);
						break;
			default:	System.out.println("Erro");
						break;
		}
	}
}