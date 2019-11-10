import java.util.*;

public class Aluno {
    
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;
    private static String[] disciplinasMatriculadas;
    private int idade;
    private String endereco;
    private int quantidadeDisciplinasPermitidas;

    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
    }

    public String fazMatricula(String disciplina) {
        Aluno.disciplinasMatriculadas = new String[quantidadeDisciplinasPermitidas];

        if (disciplinasMatriculadas.length == 0) {
            return "Este aluno não pode ser matriculado em nenhuma disciplina, "
                    + "por favor, fale com a secretaria.";
        } else {
            for (int i = 0; i < getQuantidadeDisciplinasPermitidas(); i++) {
                if (disciplinasMatriculadas[i] == null) {
                    disciplinasMatriculadas[i] = disciplina;
                    return "Matrícula na disciplina " + disciplina + " executada.";
                } else if ((i == getQuantidadeDisciplinasPermitidas() - 1) && (disciplinasMatriculadas[i] != null)) {
                    return "Quantidade de disciplinas excedida. O limite de "
                            + "disciplinas para este aluno é de 2 disciplinas."
                            + "Se desejar, cancele a matrícula de uma das disciplinas "
                            + "e faça a nova matrícula.";
                }
            }

        }
        return null;
    }

    public String cancelaMatricula(String disciplina) {
        for (int i = 0; i < getQuantidadeDisciplinasPermitidas(); i++) {
            if (disciplinasMatriculadas[i].equals(disciplina)) {
                disciplinasMatriculadas[i] = null;
                return "Cancelamento da matrícula da disciplina "
                        + disciplina + " executado com sucesso.";
            }
        }
        return "Aluno não está matriculado na disciplina" + disciplina
                + "portanto não é possível cancelar esta matrícula.";
    }


    public String imprime() {
        return "-----------------------------------------------"
                + "\nNome: " + nome
                + "\nMatrícula: " + matricula
                + "\nCurso: " + curso
                + "\nPeriodo: " + periodo
                + "\nDisciplinas Matriculadas: " + java.util.Arrays.toString(disciplinasMatriculadas)
                + "-----------------------------------------------";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String[] getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidadeDisciplinasPermitidas() {
        return quantidadeDisciplinasPermitidas;
    }

    public void setQuantidadeDisciplinasPermitidas(int quantidadeDisciplinasPermitidas) {
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
    }

}
