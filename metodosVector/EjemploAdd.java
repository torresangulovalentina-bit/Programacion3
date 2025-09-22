package metodosVector;

import java.util.Vector;

public class EjemploAdd {
    Vector<String> vectorNombres;

    public EjemploAdd() {
        vectorNombres = new Vector<>();
    }

    public void agregar() {
        vectorNombres.add("Ana");
        vectorNombres.add("Luis");
        vectorNombres.add("Carlos");
    }

    public void mostrar() {
        for (int i = 0; i < vectorNombres.size(); i++) {
            System.out.println("Posición " + i + ": " + vectorNombres.get(i));
        }
    }
}