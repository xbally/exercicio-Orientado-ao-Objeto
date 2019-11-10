package bicicleta;

public class UsaBicicleta {
    
    public static void main(String[] args) {

      Bicicleta b1 = new Bicicleta(0, 0, 1);
        try {
            b1.aumentarVelocidade(101);
            b1.aplicarFreios(1);
            b1.mudarCadencia(-1);
            b1.mudarMarcha(25);
        }catch (Exception e) {
            System.out.println(e);
        }
}
}