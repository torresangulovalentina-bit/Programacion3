package clase8.clase8;

public class TestEjemploRemove {
    public TestEjemploRemove() {
        EjemploRemove ejemplo = new EjemploRemove();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.eliminarIndice(1);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploRemove();
    }
}
