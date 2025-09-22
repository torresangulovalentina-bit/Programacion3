package clase8.clase8;

public class TestEjemploRemoveElement {
    public TestEjemploRemoveElement() {
        EjemploRemoveElement ejemplo = new EjemploRemoveElement();
        System.out.println("Antes:");
        ejemplo.mostrar();
        ejemplo.eliminarPorValor("ValorPrueba");
        System.out.println("Después:");
        ejemplo.mostrar();
    }

    public static void main(String[] args) {
        new TestEjemploRemoveElement();
    }
}
