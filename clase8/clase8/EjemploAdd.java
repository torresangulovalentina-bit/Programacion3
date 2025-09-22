package clase8.clase8;

import java.util.Vector;

public class EjemploAdd {
    private Vector<String> vector;

    public EjemploAdd() {
        vector = new Vector<>();

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void agregar() {
        vector.add("Ana");
        vector.add("Luis");
        vector.add("Carlos");

    }

}
