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
public abstract class VeiculosAereos extends Veiculos{
    private String carga;
    
    public VeiculosAereos(String nome, String tipo, String cor, int capacidade, String carga) {
        super(nome, tipo, cor, capacidade);
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
    
    @Override
    public abstract void Andar();
    
}
