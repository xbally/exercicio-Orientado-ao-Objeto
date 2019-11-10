package veiculos;

public abstract class VeiculoAquatico extends Veiculo {
    private String carga;

    public VeiculoAquatico(String carga, String cor, String tipo, int quantidade, double capacidade) {
        super(cor, tipo, quantidade, capacidade);
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public abstract void Andar();
    
}
