
package funcionario;


public class SistemaRH {

    public static void main(String[] args)  {
        Analista a1 = new Analista("Ronaldo", "00000000000", 3000, "Analista", "TI", "Java");
        Analista a2 = new Analista("Gabriel", "11111111111", 3100, "Analista", "TI", "Ruby");
        Analista a3 = new Analista("Mateus", "22222222222", 3200, "Analista", "TI", "PHP");
        Analista a4 = new Analista("Tiago", "33333333333", 3300, "Analista", "TI", ".NET");
        Analista a5 = new Analista("Leandro", "44444444444", 3400, "Analista", "TI", "C#");

        Funcionario[] func = new Funcionario[8];
        Funcionario[] sub1 = new Funcionario[4];
        Funcionario[] sub2 = new Funcionario[2];
        sub1[0] = a1;
        sub1[1] = a2;
        sub1[2] = a3;
        

        func[0] = a1;
        func[1] = a2;
        func[2] = a3;
        func[3] = a4;
        func[4] = a5;

            Gerente g1 = new Gerente("Gerente 1", "55555555555", 5000, "Gerente", "TI", sub1);
            Gerente g2 = new Gerente("Gerente 2", "00000000000", 10000, "Gerente", "TI", sub2);
            
        String relatorio;
        relatorio = getRelatorio(Funcionario);
        System.out.println(relatorio);
            
        System.out.println();
        
    }

    public static String imprimeRelatorio(Funcionario[] listaFuncionarios) {
        String relatorio = "Nome;Setor;Cargo;Salario;Bonus;Outros\n";

        for (Funcionario f : listaFuncionarios) {
            if (f instanceof Analista) {
                Analista a = (Analista) f;
            }
            relatorio += f.toString() + "\n";
        }
        return relatorio;
    }


}
