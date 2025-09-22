package clase8.clase8;

import java.util.Vector;

public class EjemploIsEmpty {
    private Vector<Integer> vector;

    public EjemploIsEmpty() {
        vector = new Vector<>();
    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void agregarNumero(int n) {
        vector.add(n);
    }

    public boolean estaVacio() {
        return vector.isEmpty();
    }

}
