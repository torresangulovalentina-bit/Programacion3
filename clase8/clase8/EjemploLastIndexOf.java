package clase8.clase8;

import java.util.Vector;

public class EjemploLastIndexOf {
    private Vector<String> vector;

    public EjemploLastIndexOf() {
        vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("A");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public int obtenerUltimaPosicion(String valor) {
        return vector.lastIndexOf(valor);
    }

}
