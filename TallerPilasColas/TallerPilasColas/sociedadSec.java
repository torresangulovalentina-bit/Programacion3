package TallerPilasColas;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class sociedadSec {
    
     // Ejercicio 6: Sociedad secreta
    public static String sociedadSecreta(List<String> nombres) {
        Queue<String> q = new ArrayDeque<>();
        for (int i = 0; i < nombres.size(); i++) {
            q.offer(nombres.get(i));
        }

        List<Character> letras = new ArrayList<>();
        while (!q.isEmpty()) {
            String nombre = q.poll();
            if (nombre != null && nombre.length() > 0) {
                letras.add(Character.toUpperCase(nombre.charAt(0)));
            }
        }

        // ordenar con burbuja (sin stream)
        for (int i = 0; i < letras.size() - 1; i++) {
            for (int j = 0; j < letras.size() - 1 - i; j++) {
                if (letras.get(j) > letras.get(j + 1)) {
                    char temp = letras.get(j);
                    letras.set(j, letras.get(j + 1));
                    letras.set(j + 1, temp);
                }
            }
        }

        String resultado = "";
        for (int i = 0; i < letras.size(); i++) {
            resultado += letras.get(i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(sociedadSecreta(Arrays.asList("Adam","Sarah","Malcolm")));
        System.out.println(sociedadSecreta(Arrays.asList("bruce","clark","diana")));
        System.out.println(sociedadSecreta(Arrays.asList("Zoe","anna","leo")));
    }
}
