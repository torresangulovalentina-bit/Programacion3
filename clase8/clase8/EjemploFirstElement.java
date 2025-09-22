package clase8.clase8;

import java.util.Vector;

public class EjemploFirstElement {
    private Vector<String> vector;

    public EjemploFirstElement() {
        vector = new Vector<>();
        vector.add("Primero");
        vector.add("Segundo");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public String obtenerPrimero() {
        return vector.firstElement();
    }

}
