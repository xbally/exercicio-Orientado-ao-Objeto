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
public abstract class VeiculosTerrestres extends Veiculos{
    
    public VeiculosTerrestres(String nome, String tipo, String cor, int capacidade) {
        super(nome, tipo, cor, capacidade);
    }
    
    @Override
    public abstract void Andar();
    
}
