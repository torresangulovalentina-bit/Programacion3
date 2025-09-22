package clase8;

import java.util.Vector;

public class EjemploSubList {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Uno");
vector.add("Dos");
vector.add("Tres");
System.out.println("Sublista (0,2): " + vector.subList(0,2));

    }
}
