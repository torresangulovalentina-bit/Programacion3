package clase8.clase8;

import java.util.Vector;

public class EjemploSize {
    private Vector<Integer> vector;

    public EjemploSize() {
        vector = new Vector<>();
        vector.add(10);
        vector.add(20);

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public int obtenerTamano() {
        return vector.size();
    }

}
