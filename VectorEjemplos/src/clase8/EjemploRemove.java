package clase8;

import java.util.Vector;

public class EjemploRemove {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
vector.remove(0);
System.out.println("Vector después de remove: " + vector);

    }
}
