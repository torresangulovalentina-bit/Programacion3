package clase8.clase8;

public class TestEjemploTrimToSize {
    public TestEjemploTrimToSize() {
        EjemploTrimToSize ejemplo = new EjemploTrimToSize();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.ajustar();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploTrimToSize();
    }
}
