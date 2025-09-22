package clase8;

import java.util.Vector;

public class EjemploSet {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Rojo");
vector.add("Verde");
vector.set(1, "Azul");
System.out.println("Vector después de set: " + vector);

    }
}
