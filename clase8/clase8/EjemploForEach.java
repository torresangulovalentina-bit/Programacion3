package clase8.clase8;

import java.util.Vector;

public class EjemploForEach {
    private Vector<String> vector;

    public EjemploForEach() {
        vector = new Vector<>();
        vector.add("Hola");
        vector.add("Mundo");

    }

    public void recorrerConForEach() {
        vector.forEach(e -> System.out.println("Elemento: " + e));
    }

}
