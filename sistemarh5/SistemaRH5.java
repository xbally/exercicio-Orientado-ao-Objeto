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
public class SistemaRH5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Analista a1 = new Analista("Java",3000,"Analista","TI","01012017","Rafael","140899","1","M","(41)99999999");
        Analista a2 = new Analista(".NET",3500,"Analista","TI","01012017","João","140899","1","M","(41)99999999");   
        Vendedor v1 = new Vendedor(8000,"Vendedor","Vendas","01012017","Bruno","140899","1","M","(41)99999999");
        Funcionario[] subordinados = new Funcionario[2];
        subordinados[0]=a1;
        subordinados[1]=a2;
        Gerente g = new Gerente(subordinados,10000,"Gerente","TI","01012017","Mario","140899","1","M","(41)99999999");

        Funcionario[] funcionarios = new Funcionario[4];
        funcionarios[0]=a1;
        funcionarios[1]=a2;
        funcionarios[2]=v1;
        funcionarios[3]=g;
        String relatorio = getRelatorio(funcionarios);
        System.out.println(relatorio);
    }
    
    public static String getRelatorio(Funcionario[] funcionarios){
        String relatorio="Nome;Setor;Salario;Cargo;Bonus;Observção\n";
        
        for(Funcionario f:funcionarios){
            if(f instanceof Analista){
                Analista a = (Analista)f;
            }
            relatorio += f.toString()+"\n";
        }
        return relatorio;
    }
    
}
