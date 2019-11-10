/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author ronaldoniz
 */
public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("Ronaldo Donizeti", 22, "Rua Benedito Calixto");
		System.out.println(imprime(p1));
		fazAniversario(p1);
		fazAniversario(p1);
		fazAniversario(p1);
		fazAniversario(p1);
		fazAniversario(p1);
		System.out.println(imprime(p1));
	}
	
	private static void fazAniversario(Pessoa p1) {
		p1.setIdade(p1.getIdade() + 1);
	}

	public static String imprime(Pessoa p1){
		String info = "Nome;Idade;Endereço\n";
	 	info += p1.toString()+"\n";
	 	return info;
	 }
	    
}