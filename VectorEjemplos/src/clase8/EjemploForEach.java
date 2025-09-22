package clase8;

import java.util.Vector;

public class EjemploForEach {
    public void ejecutar() {
        
Vector<String> vector = new Vector<>();
vector.add("Hola");
vector.add("Mundo");
vector.forEach(System.out::println);

    }
}
