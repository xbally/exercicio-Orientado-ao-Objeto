package sistemarh;


public class Analista extends Funcionario{
    private String especialidade;

    public Analista(String especialidade, double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone) {
        super(salario, cargo, setor, dataAdm, nome, data, cpf, sexo, telefone);
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
        return super.toString() +";"+getEspecialidade();
    }

    @Override
    public boolean autenticar(String sistema) {
        if(sistema.equalsIgnoreCase("Jira")){
            return true;
        }else
            return false;
    }
    
}
