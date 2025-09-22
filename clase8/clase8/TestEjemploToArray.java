package clase8.clase8;

public class TestEjemploToArray {
    public TestEjemploToArray() {
        EjemploToArray ejemplo = new EjemploToArray();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.convertirArreglo();
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploToArray();
    }
}
