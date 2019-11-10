package ufpr.org.lista2

import java.util.Scanner;							
/**	Classe DVD de um único método
*	@author Ronaldo
*/
public class DVD {
	/**	
	*	Método inicial - recebe a quantidade de DVD's que uma locadora possui 
	*	e o aluguel de cada DVD e imprime alguns dados.
	*	Na saída os dados são formatados.
	*/
	public static void main (String str[]) {
		System.out.println("Informe a quantidade de DVD's:");	
		Scanner scn = new Scanner(System.in);	//entrada
		int dvd = scn.nextInt();
		System.out.println("Informe o valor do aluguel dos DVD's:");
		Scanner scan = new Scanner(System.in);	//entrada
		float rent = scan.nextFloat();									
		System.out.printf ("Faturamento anual: R$%.2f\n", ((dvd/3)*rent)*12);	//saída
		System.out.printf ("Valor ganho com multas por mes: R$%.2f", ((dvd/10)*(1.1*rent)));	//saída
	}
}