package veiculos;


public class Barco extends VeiculoAquatico{

    public Barco(String carga, String cor, String tipo, int quantidade, double capacidade) {
        super(carga, cor, tipo, quantidade, capacidade);
    }
     @Override
    public void Andar(){
        System.out.println("Barco em movimento");
    }
}
