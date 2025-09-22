package clase8.clase8;

import java.util.Vector;

public class EjemploSet {
    private Vector<String> vector;

    public EjemploSet() {
        vector = new Vector<>();
        vector.add("Lunes");
        vector.add("Martes");
        vector.add("Miércoles");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void cambiarElemento(int indice, String nuevoValor) {
        vector.set(indice, nuevoValor);
    }

}
