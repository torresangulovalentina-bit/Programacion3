package clase8.clase8;

import java.util.Vector;
import java.util.Iterator;

public class EjemploIterator {
    private Vector<String> vector;

    public EjemploIterator() {
        vector = new Vector<>();
        vector.add("Rojo");
        vector.add("Verde");

    }

    public void recorrerConIterator() {
        Iterator<String> it = vector.iterator();
        while (it.hasNext()) {
            System.out.println("Elemento: " + it.next());
        }

    }

}
