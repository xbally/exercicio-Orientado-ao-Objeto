package funcionario;

public class Diretor extends Funcionario {

    private int qtdeDepto;

    public Diretor(String nome, String cpf, double salario, String cargo, String setor, int qtdeDepto) throws ArraySetoresException {
        super(nome, cpf, salario, cargo, setor);
           this.qtdeDepto = qtdeDepto;
    }

    public int getQtdeDepto() {
        return qtdeDepto;
    }

    public void setQtdeDepto(int qtdeDepto) {
        this.qtdeDepto = qtdeDepto;
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


