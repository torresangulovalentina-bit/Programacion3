package clase8.clase8;

import java.util.Vector;

public class EjemploRemoveElementAt {
    private Vector<String> vector;

    public EjemploRemoveElementAt() {
        vector = new Vector<>();
        vector.add("Nike");
        vector.add("Adidas");
        vector.add("Puma");

    }

    public void mostrar() {
        System.out.println("Contenido del Vector: " + vector);
    }

    public void eliminarEn(int indice) {
        vector.removeElementAt(indice);
    }

}
