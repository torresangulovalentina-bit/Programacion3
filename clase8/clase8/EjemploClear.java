package clase8.clase8;

import java.util.Vector;

public class EjemploClear {
    private Vector<String> vector;

    public EjemploClear() {
        vector = new Vector<>();
        vector.add("Rojo");
        vector.add("Verde");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void limpiar() {
        vector.clear();
    }

}
