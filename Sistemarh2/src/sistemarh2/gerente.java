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
public class gerente extends funcionario{

    public gerente(double salario, boolean ativo, String nome, String rg) {
        super(salario, ativo, nome, rg);
    }

    @Override
    public void bonifica() {
        double valor = getSalario();
        double bonus = valor * 0.3;
        }

    @Override
    public void demite() {
                  boolean demite = true;
            if(demite == true){
                System.out.println("Vinculo inativo");
             }else{
                System.out.println("Vinculo ativo");
            }
    }

    @Override
    public boolean isAtivo() {
          boolean ativo = true;
            if(ativo == true ){
            System.out.println("Valor ativo é " + ativo);
            }
            else{
              System.out.println("Não exites valor ativo");
           }   return false;
     
    }
    
}
