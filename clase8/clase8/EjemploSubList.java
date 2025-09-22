package clase8.clase8;

import java.util.Vector;
import java.util.List;

public class EjemploSubList {
    private Vector<String> vector;

    public EjemploSubList() {
        vector = new Vector<>();
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");
        vector.add("Cuatro");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public List<String> obtenerSubLista(int from, int to) {
        return vector.subList(from, to);
    }

}
