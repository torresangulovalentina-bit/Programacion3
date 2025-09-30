package TallerPilasColas;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class cadenas {
     // Ejercicio 7: Cadenas de 4 letras
    public static List<String> cadenasDeCuatro(List<String> palabras) {
        Queue<String> q = new ArrayDeque<>();
        for (int i = 0; i < palabras.size(); i++) {
            q.offer(palabras.get(i));
        }

        List<String> resultado = new ArrayList<>();
        while (!q.isEmpty()) {
            String palabra = q.poll();
            if (palabra != null && palabra.length() == 4) {
                resultado.add(palabra);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(cadenasDeCuatro(Arrays.asList("Tomate","Papa","Par")));
        System.out.println(cadenasDeCuatro(Arrays.asList("Luz","Casa","Sol","Lago")));
        System.out.println(cadenasDeCuatro(Arrays.asList("Azul","Rojo","Verde")));
    }
}
