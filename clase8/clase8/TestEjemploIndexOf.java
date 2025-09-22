package clase8.clase8;

public class TestEjemploIndexOf {
    public TestEjemploIndexOf() {
        EjemploIndexOf ejemplo = new EjemploIndexOf();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerPosicion("ValorPrueba");
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploIndexOf();
    }
}
