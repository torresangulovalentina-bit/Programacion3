import java.util.*;

public class TallerPilasColas {

    //  Diferencia entre votos
    public static int votosDiferencia(int upvotes, int downvotes) {
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < upvotes; i++) {
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

    // Pan similar
    public static boolean panSimilar(List<String> s1, List<String> s2) {
        Deque<String> d1 = new ArrayDeque<>();
        Deque<String> d2 = new ArrayDeque<>();

        // encolar los elementos
        for (int i = 0; i < s1.size(); i++) {
            d1.addLast(s1.get(i));
        }
        for (int i = 0; i < s2.size(); i++) {
            d2.addLast(s2.get(i));
        }

        if (d1.isEmpty() || d2.isEmpty()) {
            return false;
        }

        String inicio1 = d1.peekFirst();
        String inicio2 = d2.peekFirst();
        String fin1 = d1.peekLast();
        String fin2 = d2.peekLast();

        if (inicio1.equalsIgnoreCase(inicio2) && fin1.equalsIgnoreCase(fin2)) {
            return true;
        }
        return false;
    }

    //  Cuadrados y cubos
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

    // Ejercicio 4: Formato teléfono
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

    // Ejercicio 5: Segundo número más grande
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
     
}
