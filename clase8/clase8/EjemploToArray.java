package clase8.clase8;

import java.util.Vector;

public class EjemploToArray {
    private Vector<String> vector;

    public EjemploToArray() {
        vector = new Vector<>();
        vector.add("Uno");
        vector.add("Dos");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public Object[] convertirArreglo() {
        return vector.toArray();
    }

}
