package clase8.clase8;

import java.util.Vector;

public class EjemploSetSize {
    private Vector<Integer> vector;

    public EjemploSetSize() {
        vector = new Vector<>();
        vector.add(1);
        vector.add(2);

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void cambiarTamano(int nuevo) {
        vector.setSize(nuevo);
    }

}
