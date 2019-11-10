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
public abstract class Veiculos {
    private String nome;
    private String tipo;
    private String cor;
    private int capacidade;

    public Veiculos(String nome, String tipo, String cor, int capacidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.capacidade = capacidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public abstract void Andar();
    
}
