import funcionario.Gerente;
import org.junit.Test;
import static org.junit.Assert.*;

public class Teste {
    
    public Teste() {
        Gerente g1 = new Gerente("Fernando","55555555555", 5000.0, "Gerente", "TI", 5);
        double g2 = g1.getSubordinados();
           System.out.println(g2);
            
    }
    
}
