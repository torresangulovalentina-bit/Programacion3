package clase8;

import java.util.Vector;

public class EjemploRemoveElement {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
vector.removeElement("A");
System.out.println("Vector tras removeElement: " + vector);

    }
}
