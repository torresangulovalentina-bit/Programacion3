package clase8;

import java.util.Vector;

public class EjemploContainsAll {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
Vector<String> otro = new Vector<>();
otro.add("A");
System.out.println("¿Contiene todos? " + vector.containsAll(otro));

    }
}
