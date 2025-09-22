package clase8.clase8;

import java.util.Vector;

public class EjemploContains {
    private Vector<String> vector;

    public EjemploContains() {
        vector = new Vector<>();
        vector.add("Perro");
        vector.add("Gato");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public boolean contiene(String valor) {
        return vector.contains(valor);
    }

}
