package clase8.clase8;

import java.util.Vector;

public class EjemploGet {
    private Vector<String> vector;

    public EjemploGet() {
        vector = new Vector<>();
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public String obtener(int indice) {
        return vector.get(indice);
    }

}
