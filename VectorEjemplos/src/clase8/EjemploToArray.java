package clase8;

import java.util.Vector;

public class EjemploToArray {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Uno");
vector.add("Dos");
Object[] arr = vector.toArray();
for (Object o : arr) System.out.println(o);

    }
}
