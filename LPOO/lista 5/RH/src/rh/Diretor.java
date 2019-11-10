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
public class Diretor extends Funcionario {

    private int qtdeDepto;

    public Diretor(String nome, String cpf, double salario, String cargo, String setor, int qtdeDepto) throws ArraySetoresException {
        super(nome, cpf, salario, cargo, setor);
        if (qtdeDepto >= 2) {
            this.qtdeDepto = qtdeDepto;
        } else {
            throw new ArraySetoresException();
        }
    }

    @Override
    public double getBonus() {
        return 3000 * qtdeDepto + 4 * getSalario();
    }

    @Override
    public String toString() {
        return super.toString() + ";" + qtdeDepto;
    }
}
