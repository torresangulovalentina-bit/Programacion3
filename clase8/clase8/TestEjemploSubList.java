package clase8.clase8;

public class TestEjemploSubList {
    public TestEjemploSubList() {
        EjemploSubList ejemplo = new EjemploSubList();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.obtenerSubLista(1, 2);
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploSubList();
    }
}
