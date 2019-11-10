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
public class Gerente extends Funcionario{
    private Funcionario[] subordinados;

    public Gerente(Funcionario[] subordinados, double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone) {
        super(salario, cargo, setor, dataAdm, nome, data, cpf, sexo, telefone);
        this.subordinados = subordinados;
    }

    @Override
    public double getBonus() {
        double salario = this.getSalario();
        double bonus = 0.1*salario*subordinados.length + getSalario();
        return bonus;
    }
    
    @Override
    public String toString(){
        return super.toString() +";"+subordinados.length;
    }

    @Override
    public boolean autenticar(String sistema) {
        if(sistema.equalsIgnoreCase("Jira")||sistema.equalsIgnoreCase("Folha"))
            return true;
        else
            return false;
               
    }
    
}
