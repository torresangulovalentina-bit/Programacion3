package clase8;

import java.util.Vector;

public class EjemploEnsureCapacity {
    public void ejecutar() {
        
Vector<Integer> vector = new Vector<>();
vector.ensureCapacity(20);
System.out.println("Capacidad tras ensureCapacity(20): " + vector.capacity());

    }
}
