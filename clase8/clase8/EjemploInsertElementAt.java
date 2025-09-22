package clase8.clase8;

import java.util.Vector;

public class EjemploInsertElementAt {
    private Vector<String> vector;

    public EjemploInsertElementAt() {
        vector = new Vector<>();
        vector.add("Uno");
        vector.add("Dos");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void insertarEn(int indice, String valor) {
        vector.insertElementAt(valor, indice);
    }

}
