package clase8;

import java.util.Vector;

public class OperacionElementAt {
    Vector<String> nombres;

    public OperacionElementAt() {
        nombres = new Vector<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Maria");
    }

    public String obtenerElemento(int index) {
        return nombres.elementAt(index);
    }
}
