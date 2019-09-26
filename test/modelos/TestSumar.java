package modelos;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSumar {

    public TestSumar() {
    }

    @Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas();
        assertTrue(instance.Sumar(5,4) == 9);
    }
}
