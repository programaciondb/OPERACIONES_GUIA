package modelos;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestMultiplicar {

    public TestMultiplicar() {
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas();
        assertTrue(instance.Multiplicar(5, 4) == 20);
    }

}
