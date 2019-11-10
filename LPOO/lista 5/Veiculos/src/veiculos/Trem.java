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
public class Trem extends VeiculosTerrestres {
    private String carga;
    
    public Trem(String nome, String tipo, String cor, int capacidade, String carga) {
        super(nome, tipo, cor, capacidade);
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
    
    @Override
    public void Andar() {
        System.out.println("Trem em movimento");
    }
}
