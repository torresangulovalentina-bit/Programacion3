package clase8.clase8;

import java.util.Vector;

public class EjemploElementAt {
    private Vector<String> vector;

    public EjemploElementAt() {
        vector = new Vector<>();
        vector.add("Ene");
        vector.add("Feb");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public String obtenerEn(int indice) {
        return vector.elementAt(indice);
    }

}
