/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

/**
 *
 * @author ronaldoniz
 */
public class Analista extends Funcionario{
    private String especialidade;

    public Analista(String nome, String cpf, double salario, String cargo, String setor, String especialidade) {
        super(nome, cpf, salario, cargo, setor);
        this.especialidade = especialidade;
    }

    @Override
    public double getBonus() {
        return this.getSalario();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String toString(){
        return super.toString() + ";" + getEspecialidade();
    }
}
