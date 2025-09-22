package clase8.clase8;

public class TestEjemploLastElement {
    public TestEjemploLastElement() {
        EjemploLastElement ejemplo = new EjemploLastElement();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerUltimo();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploLastElement();
    }
}
