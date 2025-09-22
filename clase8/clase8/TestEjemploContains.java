package clase8.clase8;

public class TestEjemploContains {
    public TestEjemploContains() {
        EjemploContains ejemplo = new EjemploContains();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.contiene("ValorPrueba");
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploContains();
    }
}
