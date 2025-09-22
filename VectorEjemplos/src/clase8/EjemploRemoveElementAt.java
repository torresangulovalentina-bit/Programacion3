package clase8;

import java.util.Vector;

public class EjemploRemoveElementAt {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
vector.removeElementAt(0);
System.out.println("Vector tras removeElementAt: " + vector);

    }
}
