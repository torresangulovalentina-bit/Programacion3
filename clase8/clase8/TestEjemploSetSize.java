package clase8.clase8;

public class TestEjemploSetSize {
    public TestEjemploSetSize() {
        EjemploSetSize ejemplo = new EjemploSetSize();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.cambiarTamano(1);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploSetSize();
    }
}
