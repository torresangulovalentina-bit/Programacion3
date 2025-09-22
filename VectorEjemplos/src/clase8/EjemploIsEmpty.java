package clase8;

import java.util.Vector;

public class EjemploIsEmpty {
    public void ejecutar() {
        
Vector<Integer> vector = new Vector<>();
System.out.println("¿Está vacío? " + vector.isEmpty());
vector.add(5);
System.out.println("¿Está vacío ahora? " + vector.isEmpty());

    }
}
