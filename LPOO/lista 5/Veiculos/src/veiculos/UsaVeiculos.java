/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

import java.util.*;

/**
 *
 * @author ronaldoniz
 */
public class UsaVeiculos {

    public static void main(String[] args) {
        //Aviao avi = new Aviao(nome, "Trem", cor, capacidade, carga);

        String nome;
        String cor;
        String tipo;
        int capacidade;
        String carga;

        System.out.println("Quantos veiculos deseja informar?");
        Scanner scn = new Scanner(System.in);
        int qtde = scn.nextInt();
        Veiculos[] veic = new Veiculos[qtde];

        for (int i = 0; i < veic.length; i++) {
            System.out.println("Qual o tipo do veiculo " + (i + 1) + "?");
            System.out.println("1 - Carro\n2 - Trem\n3 - Aviao\n4 - Barco");
            int opt = scn.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Nome do carro: ");
                    nome = scn.next();
                    System.out.println("Cor do carro: ");
                    cor = scn.next();
                    System.out.println("Capacidade do carro: ");
                    capacidade = scn.nextInt();
                    veic[i] = new Carro(nome, "Carro", cor, capacidade);
                    break;

                case 2:
                    System.out.println("Nome do trem: ");
                    nome = scn.next();
                    System.out.println("Cor do trem: ");
                    cor = scn.next();
                    System.out.println("Capacidade do trem: ");
                    capacidade = scn.nextInt();
                    System.out.println("Carga do trem: ");
                    carga = scn.next();
                    veic[i] = new Trem(nome, "Trem", cor, capacidade, carga);
                    break;

                case 3:
                    System.out.println("Nome do aviao: ");
                    nome = scn.next();
                    System.out.println("Cor do aviao: ");
                    cor = scn.next();
                    System.out.println("Capacidade do aviao: ");
                    capacidade = scn.nextInt();
                    System.out.println("Carga do aviao: ");
                    carga = scn.next();
                    veic[i] = new Aviao(nome, "Aviao", cor, capacidade, carga);
                    break;

                case 4:
                    System.out.println("Nome do barco: ");
                    nome = scn.next();
                    System.out.println("Cor do barco: ");
                    cor = scn.next();
                    System.out.println("Capacidade do barco: ");
                    capacidade = scn.nextInt();
                    System.out.println("Carga do barco: ");
                    carga = scn.next();
                    veic[i] = new Barco(nome, "Barco", cor, capacidade, carga);
                    break;

                default:
                    break;
            }
            veic[i].Andar();
        }
    }
}
