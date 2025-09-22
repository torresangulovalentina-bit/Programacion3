package clase8;

import java.util.Vector;

public class EjemploListIterator {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
var it = vector.listIterator();
while (it.hasNext()) {
    System.out.println("ListIterator: " + it.next());
}

    }
}
