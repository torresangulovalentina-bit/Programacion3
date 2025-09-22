package clase8;

import java.util.Vector;

public class EjemploIterator {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
for (var it = vector.iterator(); it.hasNext();) {
    System.out.println("Iterando: " + it.next());
}

    }
}
