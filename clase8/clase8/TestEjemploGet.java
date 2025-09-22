package clase8.clase8;

public class TestEjemploGet {
    public TestEjemploGet() {
        EjemploGet ejemplo = new EjemploGet();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtener(1);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploGet();
    }
}
