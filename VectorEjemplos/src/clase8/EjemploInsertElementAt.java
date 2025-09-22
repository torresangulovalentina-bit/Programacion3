package clase8;

import java.util.Vector;

public class EjemploInsertElementAt {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Uno");
vector.insertElementAt("Cero", 0);
System.out.println("Vector tras insertElementAt: " + vector);

    }
}
