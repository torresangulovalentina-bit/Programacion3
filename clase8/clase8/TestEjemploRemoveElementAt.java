package clase8.clase8;

public class TestEjemploRemoveElementAt {
    public TestEjemploRemoveElementAt() {
        EjemploRemoveElementAt ejemplo = new EjemploRemoveElementAt();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.eliminarEn(1);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploRemoveElementAt();
    }
}
