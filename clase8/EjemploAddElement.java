package clase8;

public class EjemploAddElement {
    public static void main(String[] args) {
        OperacionAddElement op = new OperacionAddElement();
        op.agregarElemento(10);
        op.agregarElemento(20);
        op.agregarElemento(30);
        System.out.println("Elementos en el Vector: " + op.getNumeros());
    }
}
