package clase8;

import java.util.Vector;

public class EjemploSetSize {
    public void ejecutar() {
        
Vector<Integer> vector = new Vector<>();
vector.add(1);
vector.add(2);
vector.setSize(5);
System.out.println("Tamaño tras setSize(5): " + vector.size());

    }
}
