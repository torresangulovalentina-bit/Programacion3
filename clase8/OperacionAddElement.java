package clase8;

import java.util.Vector;

public class OperacionAddElement {
    Vector<Integer> numeros;

    public OperacionAddElement() {
        numeros = new Vector<>();
    }

    public void agregarElemento(int num) {
        numeros.addElement(num);
    }

    public Vector<Integer> getNumeros() {
        return numeros;
    }
}
