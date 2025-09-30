package TallerPilasColas;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

 // Pan similar
public class panSimilar {
    
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

    public static void main(String[] args) {
        System.out.println(panSimilar(
                Arrays.asList("pan blanco", "lechuga", "pan blanco"),
                Arrays.asList("pan blanco", "tomate", "pan blanco")
        ));
        System.out.println(panSimilar(
                Arrays.asList("pan integral", "queso", "pan integral"),
                Arrays.asList("pan blanco", "queso", "pan integral")
        ));
    }
}
