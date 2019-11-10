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
public class Barco extends VeiculosAquaticos {

    public Barco(String nome, String tipo, String cor, int capacidade, String carga) {
        super(nome, tipo, cor, capacidade, carga);
    }
    
    @Override
    public void Andar() {
        System.out.println("Barco em movimento");
    }
}
