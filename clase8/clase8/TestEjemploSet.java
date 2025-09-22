package clase8.clase8;

public class TestEjemploSet {
    public TestEjemploSet() {
        EjemploSet ejemplo = new EjemploSet();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.cambiarElemento(1, "Nuevo");
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploSet();
    }
}
