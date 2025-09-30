package TallerPilasColas;
import java.util.ArrayDeque;
import java.util.Queue;

// Ejercicio 4: Formato teléfono
public class formatoTel {
    
    public static String formatoTelefono(int[] digitos) {
        if (digitos == null || digitos.length != 10) {
            throw new IllegalArgumentException("Se requieren 10 dígitos.");
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < digitos.length; i++) {
            q.offer(digitos[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < 3; i++) {
            sb.append(q.poll());
        }
        sb.append(") ");
        for (int i = 0; i < 3; i++) {
            sb.append(q.poll());
        }
        sb.append("-");
        for (int i = 0; i < 4; i++) {
            sb.append(q.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatoTelefono(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(formatoTelefono(new int[]{3,0,0,1,2,3,4,5,6,7}));
    }
}
