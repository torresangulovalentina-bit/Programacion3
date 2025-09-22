package clase8.clase8;

public class TestEjemploContainsAll {
    public TestEjemploContainsAll() {
        EjemploContainsAll ejemplo = new EjemploContainsAll();
        System.out.println("Antes:");
        ejemplo.mostrar();
        java.util.ArrayList<String> lista = new java.util.ArrayList<>();
        lista.add("Ana");
        System.out.println("Llamando al método...");
        System.out.println("Resultado: " + ejemplo.contieneTodos(lista));
        System.out.println("Después:");
        ejemplo.mostrar();
        System.out.println("Después:");
        ejemplo.mostrar();
        return;
    }

    public static void main(String[] args) {
        new TestEjemploContainsAll();
    }
}
