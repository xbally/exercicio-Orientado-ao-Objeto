/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

public class Gerente extends Funcionario{
    private Funcionario[] subordinados;

    public Gerente(String nome, String cpf, double salario, String cargo, String setor, Funcionario[] subordinados) {
        super(nome, cpf, salario, cargo, setor);
        this.subordinados = subordinados;
    }

    @Override
    public double getBonus() {
        double salario = this.getSalario();
        return 100*subordinados.length + 2*getSalario();
    }
    
    @Override
    public String toString(){
        return super.toString() + ";" + subordinados.length;
    }
}
