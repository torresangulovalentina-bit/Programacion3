package clase8.clase8;

public class TestEjemploAdd {
    public TestEjemploAdd() {
        EjemploAdd ejemplo = new EjemploAdd();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.agregar();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploAdd();
    }
}
