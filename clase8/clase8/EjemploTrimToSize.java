package clase8.clase8;

import java.util.Vector;

public class EjemploTrimToSize {
    private Vector<Integer> vector;

    public EjemploTrimToSize() {
        vector = new Vector<>(10);
        vector.add(1);
        vector.add(2);

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public int obtenerCapacidad() {
        return vector.capacity();
    }

    public void ajustar() {
        vector.trimToSize();
    }

}
