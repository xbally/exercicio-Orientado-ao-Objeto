/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;


/**
 *
 * @author rafae
 */
public class Diretor extends Funcionario{

    public Diretor(String nome, String cpf, String sexo, double salario, String cargo, String setor) {
        super(nome, cpf, sexo, salario, cargo, setor);
    }
    
    public double getVendas(){
        return 100000;
    }

    @Override
    public double getBonus() {
        //Buscar a quantidade vendida
        double vendas = getVendas();
        double bonus = (vendas/50000)*this.getSalario();
        return bonus;
    }
    
    @Override
    public String toString(){
        return super.toString() + ";"+this.getVendas();
    }
    
}
