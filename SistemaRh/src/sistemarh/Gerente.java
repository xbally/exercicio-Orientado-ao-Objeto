package sistemarh;


public class Gerente extends Funcionario{
    private int subordinados;

    public Gerente(int subordinados, double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone) throws ArraySubordinadosException{
        super(salario, cargo, setor, dataAdm, nome, data, cpf, sexo, telefone);
        if(subordinados > 3){
        this.subordinados = subordinados;     
    }else{
         throw new ArraySubordinadosException();     
        }
    }
    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) throws Exception{
        if(subordinados >= 2){
        this.subordinados = subordinados;
        }else{
            throw new Exception ("Numero de subordinados é inferior a 2");
        }
    }

    @Override
    public double getBonus() {
        double salario = this.getSalario();
        double bonus = 0.1*salario*subordinados + getSalario();
        return bonus;
    }
    
    @Override
    public String toString(){
        return super.toString() +";"+subordinados;
    }

    @Override
    public boolean autenticar(String sistema) {
        if(sistema.equalsIgnoreCase("Jira")||sistema.equalsIgnoreCase("Folha"))
            return true;
        else
            return false;
               
    }
    
}
