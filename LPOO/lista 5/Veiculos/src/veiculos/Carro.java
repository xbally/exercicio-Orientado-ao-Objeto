/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author ronaldoniz
 */
public class Carro extends VeiculosTerrestres {
    
    public Carro(String nome, String tipo, String cor, int capacidade) {
        super(nome, tipo, cor, capacidade);
    }

    @Override
    public void Andar() {
        System.out.println("Carro em movimento");
    }
    
}
