package clase8;

import java.util.Vector;

public class EjemploIndexOf {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
vector.add("A");
System.out.println("Primera posición de A: " + vector.indexOf("A"));

    }
}
