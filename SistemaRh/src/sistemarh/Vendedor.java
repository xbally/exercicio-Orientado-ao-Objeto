
package sistemarh;


public class Vendedor extends Funcionario{

    public Vendedor(double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone) {
        super(salario, cargo, setor, dataAdm, nome, data, cpf, sexo, telefone);
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

    @Override
    public boolean autenticar(String sistema) {
        if(sistema.equalsIgnoreCase("Vendas")){
            return true;
        }else{
            return false;
        }
    }
    
}
