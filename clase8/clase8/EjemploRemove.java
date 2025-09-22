package clase8.clase8;

import java.util.Vector;

public class EjemploRemove {
    private Vector<String> vector;

    public EjemploRemove() {
        vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void eliminarIndice(int indice) {
        vector.remove(indice);
    }

}
