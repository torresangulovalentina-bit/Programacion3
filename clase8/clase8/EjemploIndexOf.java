package clase8.clase8;

import java.util.Vector;

public class EjemploIndexOf {
    private Vector<String> vector;

    public EjemploIndexOf() {
        vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("A");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public int obtenerPosicion(String valor) {
        return vector.indexOf(valor);
    }

}
