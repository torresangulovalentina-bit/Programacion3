package clase8.clase8;

public class TestEjemploInsertElementAt {
    public TestEjemploInsertElementAt() {
        EjemploInsertElementAt ejemplo = new EjemploInsertElementAt();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.insertarEn(1, "Nuevo");
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploInsertElementAt();
    }
}
