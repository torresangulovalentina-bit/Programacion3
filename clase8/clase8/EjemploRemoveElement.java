package clase8.clase8;

import java.util.Vector;

public class EjemploRemoveElement {
    private Vector<String> vector;

    public EjemploRemoveElement() {
        vector = new Vector<>();
        vector.add("A");
        vector.add("B");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void eliminarPorValor(String valor) {
        vector.removeElement(valor);
    }

}
