/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author ronaldoniz
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private int periodo;
    private String[] disciplinasMatriculadas;
    private int idade;
    private String endereco;
    public final int quantidadeDisciplinasPermitidas;

    public Aluno(String nome, String matricula, String curso, int periodo, int idade, int quantidadeDisciplinasPermitidas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.idade = idade;
        this.quantidadeDisciplinasPermitidas = quantidadeDisciplinasPermitidas;
        
        fazMatricula("LPOO");
        fazMatricula("Gestão de Projetos");
        fazMatricula("UML");
    }
    
    public void main(String[] args) {
        Aluno a1 = new Aluno("Ronaldo Donizeti", "GRR20163946", "TADS", 4, 22, 2);
    } 
    
    private String fazMatricula(String disciplina) {
        if (disciplinasMatriculadas[1] != null) {
            return "Quantidade de disciplinas excedida. O limite de "
                    + "disciplinas para este aluno é de 2 disciplinas."
                    + "Se desejar, cancele a matrícula de uma das disciplinas "
                    + "e faça a nova matrícula.";
        } else if (disciplinasMatriculadas[0] == null) {
            disciplinasMatriculadas[0] = disciplina;
            return "Matrícula na disciplina " + disciplina + " executada.";
        } else {
            disciplinasMatriculadas[1] = disciplina;
            return "Matrícula na disciplina " + disciplina + " executada.";
        }  
    }
    
    private void cancelaMatricula(String disciplina) {
        
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
    
    

}

