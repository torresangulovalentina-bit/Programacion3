package clase8.clase8;

public class TestEjemploFirstElement {
    public TestEjemploFirstElement() {
        FirstElement ejemplo = new FirstElement();
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
