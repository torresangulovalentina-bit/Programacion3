package clase8.clase8;

public class TestEjemploEnsureCapacity {
    public TestEjemploEnsureCapacity() {
        EjemploEnsureCapacity ejemplo = new EjemploEnsureCapacity();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.aumentarCapacidad(10);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploEnsureCapacity();
    }
}
