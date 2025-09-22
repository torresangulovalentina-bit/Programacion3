package clase8.clase8;

import java.util.Vector;

public class EjemploCapacity {
    private Vector<Integer> vector;

    public EjemploCapacity() {
        vector = new Vector<>(3);
    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public int obtenerCapacidad() {
        return vector.capacity();
    }

}
