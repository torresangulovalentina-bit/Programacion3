package clase8.clase8;

public class TestEjemploSize {
    public TestEjemploSize() {
        EjemploSize ejemplo = new EjemploSize();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerTamano();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploSize();
    }
}
