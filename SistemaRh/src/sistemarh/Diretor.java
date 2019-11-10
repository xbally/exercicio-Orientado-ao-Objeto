package sistemarh;


public class Diretor extends Funcionario{
    private int departamento;

    public Diretor(int departamento, double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone) throws ArrayDepartamentoException {
        super(salario, cargo, setor, dataAdm, nome, data, cpf, sexo, telefone);
        if(departamento >=2){
            this.departamento=departamento;
        }else{
            throw new ArrayDepartamentoException();
        }
    }

    @Override
    public double getBonus() {
        double salario = this.getSalario();
        double bonus = 0.3*departamento + 4*getSalario();
        return bonus;
    }
    
    @Override
    public String toString(){
        return super.toString() +";"+departamento;
    }

    @Override
    public boolean autenticar(String sistema) {
        if(sistema.equalsIgnoreCase("Jira")||sistema.equalsIgnoreCase("Folha"))
            return true;
        else
            return false;
               
    }
    
}
