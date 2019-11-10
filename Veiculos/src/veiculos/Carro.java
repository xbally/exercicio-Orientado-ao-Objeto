package veiculos;

public class Carro extends VeiculoTerrestre{

    public Carro(String carga, String cor, String tipo, int quantidade, double capacidade) {
        super(carga, cor, tipo, quantidade, capacidade);
    }

 
    /**
     *
     */
    @Override
    public void Andar(){
        System.out.println("Carro em movimento");
    }
    
}
    