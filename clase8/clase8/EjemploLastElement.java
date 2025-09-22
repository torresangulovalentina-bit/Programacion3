package clase8.clase8;

import java.util.Vector;

public class EjemploLastElement {
    private Vector<String> vector;

    public EjemploLastElement() {
        vector = new Vector<>();
        vector.add("Primero");
        vector.add("Segundo");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public String obtenerUltimo() {
        return vector.lastElement();
    }

}
