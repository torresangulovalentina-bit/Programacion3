package clase8.clase8;

public class TestEjemploLastIndexOf {
    public TestEjemploLastIndexOf() {
        EjemploLastIndexOf ejemplo = new EjemploLastIndexOf();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerUltimaPosicion("ValorPrueba");
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploLastIndexOf();
    }
}
