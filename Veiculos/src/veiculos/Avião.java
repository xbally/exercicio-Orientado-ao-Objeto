package veiculos;

public class Avião extends VeiculoAereo{

    public Avião(String carga, String cor, String tipo, int quantidade, double capacidade) {
        super(carga, cor, tipo, quantidade, capacidade);
    }
    @Override
    public void Andar(){
        System.out.println("Avião em movimento");
    }
}
