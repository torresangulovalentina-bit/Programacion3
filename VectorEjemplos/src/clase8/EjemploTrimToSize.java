package clase8;

import java.util.Vector;

public class EjemploTrimToSize {
    public void ejecutar() {
        
Vector<Integer> vector = new Vector<>(10);
vector.add(1);
vector.add(2);
vector.trimToSize();
System.out.println("Capacidad tras trimToSize: " + vector.capacity());

    }
}
