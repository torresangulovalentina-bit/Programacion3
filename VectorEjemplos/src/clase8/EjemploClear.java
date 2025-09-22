package clase8;

import java.util.Vector;

public class EjemploClear {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Uno");
vector.add("Dos");
vector.clear();
System.out.println("Vector después de clear: " + vector);

    }
}
