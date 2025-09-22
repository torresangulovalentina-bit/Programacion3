package clase8.clase8;

public class TestEjemploElementAt {
    public TestEjemploElementAt() {
        EjemploElementAt ejemplo = new EjemploElementAt();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerEn(1);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploElementAt();
    }
}
