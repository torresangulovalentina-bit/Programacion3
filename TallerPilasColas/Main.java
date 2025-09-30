import java.util.Arrays;

public class Main {

    public static int votosDiferencia(int a, int b) {
        return a - b;
    }

    public static boolean panSimilar(java.util.List<String> lista1, java.util.List<String> lista2) {
        if (lista1.isEmpty() || lista2.isEmpty()) return false;
        return lista1.get(0).equals(lista2.get(0)) && lista1.get(lista1.size()-1).equals(lista2.get(lista2.size()-1));
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1 ===");
        System.out.println(votosDiferencia(13, 0));    // 13
        System.out.println(votosDiferencia(2, 33));    // -31
        System.out.println(votosDiferencia(132, 132)); // 0

        System.out.println("\n=== Ejercicio 2 ===");
        System.out.println(panSimilar(
                Arrays.asList("pan blanco", "lechuga", "pan blanco"),
                Arrays.asList("pan blanco", "tomate", "pan blanco")
        ));
        System.out.println(panSimilar(
                Arrays.asList("pan integral", "queso", "pan integral"),
                Arrays.asList("pan blanco", "queso", "pan integral")
        ));

        System.out.println("\n=== Ejercicio 3 ===");
        System.out.println(cuadradosYCubos(4, 8));   // true
        System.out.println(cuadradosYCubos(16, 48)); // false
        System.out.println(cuadradosYCubos(9, 27));  // true

        System.out.println("\n=== Ejercicio 4 ===");
        System.out.println(formatoTelefono(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println(formatoTelefono(new int[]{3,0,0,1,2,3,4,5,6,7}));

        System.out.println("\n=== Ejercicio 5 ===");
        System.out.println(segundoMasGrande(new int[]{10,40,30,20,50}));
        System.out.println(segundoMasGrande(new int[]{5,5,5,5,9}));
        System.out.println(segundoMasGrande(new int[]{-3,-1,-7,-2}));

        System.out.println("\n=== Ejercicio 6 ===");
        System.out.println(sociedadSecreta(Arrays.asList("Adam","Sarah","Malcolm")));
        System.out.println(sociedadSecreta(Arrays.asList("bruce","clark","diana")));
        System.out.println(sociedadSecreta(Arrays.asList("Zoe","anna","leo")));

        System.out.println("\n=== Ejercicio 7 ===");
        System.out.println(cadenasDeCuatro(Arrays.asList("Tomate","Papa","Par")));
        System.out.println(cadenasDeCuatro(Arrays.asList("Luz","Casa","Sol","Lago")));
        System.out.println(cadenasDeCuatro(Arrays.asList("Azul","Rojo","Verde")));

        System.out.println("\n=== Ejercicio 8 ===");
        System.out.println(guerraDeNumeros(new int[]{2,8,7,5}));
        System.out.println(guerraDeNumeros(new int[]{1,3,5,9}));
        System.out.println(guerraDeNumeros(new int[]{2,4,6,8}));
    }

}
