package TallerPilasColas;

import java.util.ArrayDeque;
import java.util.Queue;

public class guerraNum {
      // Ejercicio 8: Guerra de números
    public static int guerraDeNumeros(int[] arr) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
        }

        int sumaPares = 0;
        int sumaImpares = 0;
        while (!q.isEmpty()) {
            int v = q.poll();
            if (v % 2 == 0) {
                sumaPares += v;
            } else {
                sumaImpares += v;
            }
        }
        return Math.abs(sumaImpares - sumaPares);
    }

    public static void main(String[] args) {
        System.out.println(guerraDeNumeros(new int[]{2,8,7,5}));
        System.out.println(guerraDeNumeros(new int[]{1,3,5,9}));
        System.out.println(guerraDeNumeros(new int[]{2,4,6,8}));
    }
}
