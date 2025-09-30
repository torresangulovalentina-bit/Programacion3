package TallerPilasColas;
import java.util.*;

public class diferenciaVotos {

    //  Diferencia entre votos
    public static int votosDiferencia(int upvotes, int downvotes) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < upvotes ; i++) {
            q.offer(1);
        }
        for (int i = 0; i < downvotes; i++) {
            q.offer(-1);
        }

        int suma = 0;
        while (!q.isEmpty()) {
            suma += q.poll();
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(votosDiferencia(13, 0));
        System.out.println(votosDiferencia(2, 33));
        System.out.println(votosDiferencia(132, 132));
    }
}
