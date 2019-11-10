package aluno;

import java.util.*;


public class UsaAluno {

    private static Aluno[] escola;

    public static void main(String[] args) {
        System.out.println("Quantos alunos serão cadastrados?");
        Scanner scn = new Scanner(System.in);
        int qtde = scn.nextInt();
        escola = new Aluno[qtde];

        System.out.println("1 – Cadastrar Aluno"
                + "\n2 – Excluir aluno por nome"
                + "\n3 – Listar Alunos"
                + "\n4 – Matricular Aluno em Disciplina"
                + "\n5 – Cancelar Matrícula"
                + "\n6 – Imprimir lista Alunos e Disciplinas Matriculadas.");
        int escolha = scn.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Nome do aluno: ");
                String nome = scn.next();
                System.out.println("Matricula do aluno: ");
                String matricula = scn.next();
                System.out.println("Curso do aluno: ");
                String curso = scn.next();
                System.out.println("Periodo do aluno: ");
                int periodo = scn.nextInt();
                System.out.println("Idade do aluno: ");
                int idade = scn.nextInt();
                System.out.println("Maximo de disciplinas: ");
                int disciplinas = scn.nextInt();
                Aluno a = new Aluno(nome, matricula, curso, periodo, idade, disciplinas);
                cadastrarAluno(a);
                break;
            case 2:
                System.out.println("Digite no do aluno");
                String name = scn.next();
                excluirAlunoPorNome(name);
                break;
            case 3:
                System.out.println("Lista de aluno");
                System.out.println("Escreve primeiro nome do aluno");
                String lista = snc.next();
                listarAlunos(lista);
        }
    }

    public static void cadastrarAluno(Aluno aluno) {
        for (int i = 0;i < escola.length;i++) {
            if (escola[i] == null) {
                escola[i] = aluno;
                return;
            }
        }
    }

    public static void excluirAlunoPorNome(String nomeAluno) {
        for (int i = 0; i < escola.length; i++) {
            if (escola[i].getNome() == nomeAluno) {
                escola[i] = null;
            }
        }
    }

    public static String listarAlunos(String lista, String getNome){ 
            for(int i = 0; i < escola.length; i++){
                    if(escola[i].getNome() != null){
                        if(escola[i].getNome == lista)
                               return "Alunos são :" + getNome;
                    }else{
                    if(escola[i].getNome() == null){
                      return "Não contem aluno registrado";
                    }
                }
            }
        return "Não contem aluno registrado";
  }

     public static String imprimirListaDeAlunoseDisciplinas() {
         for(int i =0; i < escola.length; i++);{
            if(escola[i].getdisciplinasMatriculadas == getdisciplinasMatriculadas){
                if(escola[i]getNome = disciplina){
                    
            }
            }
     }
        return null;

    }

    public SistemaAcademico() {
        this.escola = new Aluno[qtde];
    }

}