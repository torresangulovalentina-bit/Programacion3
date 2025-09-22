package clase8.clase8;

public class TestEjemploIsEmpty {
    public TestEjemploIsEmpty() {
        EjemploIsEmpty ejemplo = new EjemploIsEmpty();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.estaVacio();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploIsEmpty();
    }
}
