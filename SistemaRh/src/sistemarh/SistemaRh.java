package sistemarh;


public class SistemaRh {
//(Funcionario[] deparmantento, double salario, String cargo, String setor, String dataAdm, String nome, String data, String cpf, String sexo, String telefone)
    public static void main(String[] args) {
        Analista a1 = new Analista(".NET",3.500,"Analista","TI","01012017","Ronaldo","140899","1","M","(41)99999999");
        Analista a2 = new Analista("JAVA",3.500,"Analista","TI","01012017","Gabriel","140895","1","M","(41)99999999");
        Analista a3 = new Analista("PHP",3.500,"Analista","TI","01012017","Mateus","140894","1","M","(41)99999999");
        Analista a4 = new Analista("RUBY",3.500,"Analista","TI","01012017","Leandro","140889","1","M","(41)99999999");
        Analista a5 = new Analista("ANGULAR",3.500,"Analista","TI","01012017","Tiago","140879","1","M","(41)99999999");

        Funcionario[] func = new Funcionario[8];
        Funcionario[] sub1 = new Funcionario[3];
        Funcionario[] sub2 = new Funcionario[2];
        sub1[0] = a1;
        sub1[1] = a2;
        sub1[2] = a3;
        sub2[0] = a4;
        sub2[1] = a5;
   
        func[0] = a1;
        func[1] = a2;
        func[2] = a3;
        func[3] = a4;
        func[4] = a5;

        try {
            Gerente g = new Gerente(3 ,10.0000,"Gerente","TI","01012017","Mario","140899","1","M","(41)99999999");
            func[5] = g;
            Gerente g1 = new Gerente(2 ,10.0000,"Gerente","TI","01012017","Mario","140899","1","M","(41)99999999");
            func[6] = g1;
        } catch (ArraySubordinadosException e) {
            System.out.println(e);
        }

        try {
            Diretor d = new Diretor(5 ,2.000,"Diretor","ADM","10/05/1997","Fernando","10","099999999","m","(41)99999999");
            func[7] = d;
        } catch (ArrayDepartamentoException e) {
            System.out.println(e);
        }
 
    
     
      //  Gerente g = new Gerente(2,10.0000,"Gerente","TI","01012017","Mario","140899","1","M","(41)99999999");
       // Diretor d = new Diretor(3,2.000,"Diretor","ADM","10/05/1997","Fernando","10","099999999","m","(41)99999999");

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

