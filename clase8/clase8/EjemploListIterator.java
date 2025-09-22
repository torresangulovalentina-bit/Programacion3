package clase8.clase8;

import java.util.Vector;
import java.util.ListIterator;

public class EjemploListIterator {
    private Vector<String> vector;

    public EjemploListIterator() {
        vector = new Vector<>();
        vector.add("Perro");
        vector.add("Gato");

    }

    public void recorrerConListIterator() {
        ListIterator<String> it = vector.listIterator();
        while (it.hasNext()) {
            System.out.println("Elemento: " + it.next());
        }

    }

}
