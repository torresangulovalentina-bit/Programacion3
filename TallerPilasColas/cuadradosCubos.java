package TallerPilasColas;
import java.util.Stack;

 //  Cuadrados y cubos
public class cuadradosCubos {
    
     public static boolean cuadradosYCubos(int a, int b) {
        Stack<Integer> pila = new Stack<>();
        pila.push(a);
        pila.push(b);

        int bPop = pila.pop();
        int aPop = pila.pop();

        double raizCuadrada = Math.sqrt(aPop);
        double raizCubica = Math.cbrt(bPop);

        if (Math.abs(raizCuadrada - raizCubica) <= 0.000000001) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(cuadradosYCubos(4, 8));
        System.out.println(cuadradosYCubos(16, 48));
        System.out.println(cuadradosYCubos(9, 27));
    }
}
