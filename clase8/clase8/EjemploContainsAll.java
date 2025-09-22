package clase8.clase8;

import java.util.Vector;
import java.util.ArrayList;

public class EjemploContainsAll {
    private Vector<String> vector;

    public EjemploContainsAll() {
        vector = new Vector<>();
        vector.add("Ana");
        vector.add("Luis");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public boolean contieneTodos(ArrayList<String> lista) {
        return vector.containsAll(lista);
    }

}
