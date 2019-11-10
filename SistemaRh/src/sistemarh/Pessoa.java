package sistemarh;


public abstract class Pessoa {
    private String nome;
    private String data;
    private String cpf;
    private String sexo;
    private String telefone;

    public Pessoa(String nome, String data, String cpf, String sexo, String telefone) {
        this.nome = nome;
        this.data = data;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    
    
    
}
