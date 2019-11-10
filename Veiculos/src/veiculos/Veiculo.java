package veiculos;


public abstract class Veiculo {
    private String cor;
    private String tipo;
    private int quantidade;
    private double capacidade;
    
    
    public Veiculo(String cor, String tipo, int quantidade, double capacidade) {
        this.cor = cor;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    
    public abstract void Andar(); 
}
