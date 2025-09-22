package clase8.clase8;

public class TestEjemploCapacity {
    public TestEjemploCapacity() {
        EjemploCapacity ejemplo = new EjemploCapacity();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerCapacidad();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploCapacity();
    }
}
