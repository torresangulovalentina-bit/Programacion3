package TallerPilasColas;

import java.util.ArrayDeque;
import java.util.Queue;

// Ejercicio 5: Segundo número más grande
public class segundoNum {
    public static int segundoMasGrande(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Se requieren al menos 2 elementos.");
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int v = q.poll();
            if (v > max1) {
                max2 = max1;
                max1 = v;
            } else if (v > max2) {
                max2 = v;
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        System.out.println(segundoMasGrande(new int[]{10,40,30,20,50}));
        System.out.println(segundoMasGrande(new int[]{5,5,5,5,9}));
        System.out.println(segundoMasGrande(new int[]{-3,-1,-7,-2}));
    }
}
