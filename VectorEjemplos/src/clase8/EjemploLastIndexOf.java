package clase8;

import java.util.Vector;

public class EjemploLastIndexOf {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
vector.add("A");
System.out.println("Última posición de A: " + vector.lastIndexOf("A"));

    }
}
