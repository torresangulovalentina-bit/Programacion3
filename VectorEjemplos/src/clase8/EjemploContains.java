package clase8;

import java.util.Vector;

public class EjemploContains {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Perro");
vector.add("Gato");
System.out.println("¿Contiene Gato? " + vector.contains("Gato"));

    }
}
