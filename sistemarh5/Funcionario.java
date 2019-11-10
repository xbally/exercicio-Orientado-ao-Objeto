/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh5;

/**
 *
 * @author rafae
 */
public abstract class Funcionario extends Pessoa implements Autenticavel{
    private double salario;
    private String cargo;
    private String setor;
    private String dataAdm;

    public Funcionario(double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone) {
        super(nome, data, cpf, sexo, telefone);
        this.salario = salario;
        this.cargo = cargo;
        this.setor = setor;
        this.dataAdm = dataAdm;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }
    
    public abstract double getBonus();
    
    public String toString(){
        return super.toString() +";"+getSetor()+";"+getSalario()+";"+getCargo()+";"+getBonus();
    }
    
}
