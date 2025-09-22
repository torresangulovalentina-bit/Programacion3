package clase8.clase8;

public class TestEjemploClear {
    public TestEjemploClear() {
        EjemploClear ejemplo = new EjemploClear();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.limpiar();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploClear();
    }
}
