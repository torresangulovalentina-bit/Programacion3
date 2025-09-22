package clase8.clase8;

public class TestEjemploFirstElement {
    public TestEjemploFirstElement() {
        EjemploFirstElement ejemplo = new EjemploFirstElement();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerPrimero();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploFirstElement();
    }
}
