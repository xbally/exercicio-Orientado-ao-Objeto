package veiculos;

public class Trem extends VeiculoTerrestre{

    public Trem(String carga, String cor, String tipo, int quantidade, double capacidade) {
        super(carga, cor, tipo, quantidade, capacidade);
    }
    
    @Override
    public void Andar(){
        System.out.println("Carro em movimento");
    }
}
