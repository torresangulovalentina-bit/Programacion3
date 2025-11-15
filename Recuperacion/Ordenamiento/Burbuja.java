package Recuperacion.Ordenamiento;

import java.util.*;

public class Burbuja {

    // Método que ordena un mapa por valores (distancia) usando Burbuja
    public static List<Map.Entry<String, Integer>> ordenarPorDistancia(Map<String, Integer> distancias) {
        // Convertir el mapa en una lista
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(distancias.entrySet());

        // Algoritmo de burbuja
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).getValue() > lista.get(j + 1).getValue()) {
                    // Intercambiar posiciones
                    Map.Entry<String, Integer> temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        return lista;
    }
}
