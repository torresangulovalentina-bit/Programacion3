package clase8.clase8;

import java.util.Vector;

public class EjemploEnsureCapacity {
    private Vector<Integer> vector;

    public EjemploEnsureCapacity() {
        vector = new Vector<>();
    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public int obtenerCapacidad() {
        return vector.capacity();
    }

    public void aumentarCapacidad(int cap) {
        vector.ensureCapacity(cap);
    }

}
