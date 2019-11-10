package funcionario;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String cargo;
    private String setor;

    public Funcionario(String nome, String cpf, double salario, String cargo, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getRelatorio() {
        String relatorio = null;
        return relatorio;
    }


    public abstract double getBonus();
    
    @Override
    public String toString(){
        return getNome() + ";" + getSetor() + ";" + getCargo() + ";" + getSalario() + ";" + getBonus();
    }
    
}
