/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemarh2;

/**
 *
 * @author gabri
 */
public abstract  class funcionario extends pessoa implements funcionarioI{

    private double salario;
    private boolean ativo;

    public funcionario(double salario, boolean ativo, String nome, String rg) {
        super(nome, rg);
        this.salario = salario;
        this.ativo = ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    //Refazer
    public boolean isAtivo(String sistema){
            boolean ativo = true;
            if(ativo == true ){
            System.out.println("Valor ativo é " + this.ativo);
            }
            else{
              System.out.println("Não exites valor ativo");
           }   return false;
     
    }
    
    public void demite(){
            boolean demite = true;
            if(demite == true){
                System.out.println("Vinculo inativo");
             }else{
                System.out.println("Vinculo ativo");
            }
    }
    
    
    public String toString(){
        return super.toString() +";"+getNome()+";"+getSalario()+";"+getRg()+";"+isAtivo();
    }
    
}
