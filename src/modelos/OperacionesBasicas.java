package modelos;

public class OperacionesBasicas {

    public int Sumar(int a, int b) {
        if (a != 0 & b != 0) {
            return a + b;
        }
        return 0;
    }

    public int Restar(int a, int b) {
        if (a >= b) {
            return a - b;
        }
        return 0;
    }

    public int Multiplicar(int a, int b) {
        if (b != 0) {
            return a * b;
        }
        return 1;
    }

    public int Dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }

}
