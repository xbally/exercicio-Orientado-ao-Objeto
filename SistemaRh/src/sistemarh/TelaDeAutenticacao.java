package sistemarh;

public class TelaDeAutenticacao {
    public static void main(String[] args){
        Analista a1 = new Analista("Java",3000,"Analista","TI","01012017","Rafael","140899","1","M","(41)99999999");
        Vendedor v1 = new Vendedor(8000,"Vendedor","Vendas","01012017","Bruno","140899","1","M","(41)99999999");
        if(verificaAutenticacao(a1,"u","s","Jira")){
            System.out.println("Usuário Autenticado no sistema Jira.");
        }else{
            System.out.println("Usuário não Autenticado no sistema Jira.");
        }
        
        if(verificaAutenticacao(a1,"u","s","Vendas")){
            System.out.println("Usuário Autenticado no sistema Vendas.");
        }else{
            System.out.println("Usuário não Autenticado no sistema Vendas.");
        }
    }
    
    public static boolean verificaAutenticacao(Autenticavel aut,String u,String s,String sistema){
        //Verifica usuario e senha
        //Verifica sistema
        return aut.autenticar(sistema);
            
        
    }
    
}
