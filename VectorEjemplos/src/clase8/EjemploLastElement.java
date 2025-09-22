package clase8;

import java.util.Vector;

public class EjemploLastElement {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Primero");
vector.add("Segundo");
System.out.println("Último elemento: " + vector.lastElement());

    }
}
