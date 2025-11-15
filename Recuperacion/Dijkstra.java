package Recuperacion;

import java.util.*;

public class Dijkstra {

    public static Map<String, Integer> calcularDistancias(Grafo grafo, String origen) {
        Map<String, Integer> distancias = new HashMap<>();
        PriorityQueue<Nodo> cola = new PriorityQueue<>(Comparator.comparingInt(n -> n.distancia));
        Set<String> visitados = new HashSet<>();

        // Inicializar distancias
        for (String ciudad : grafo.getAdyacencia().keySet()) {
            distancias.put(ciudad, Integer.MAX_VALUE);
        }
        distancias.put(origen, 0);
        cola.add(new Nodo(origen, 0));

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            if (!visitados.add(actual.nombre)) continue;

            for (Arista arista : grafo.getAdyacencia().get(actual.nombre)) {
                int nuevaDist = distancias.get(actual.nombre) + arista.distancia;
                if (nuevaDist < distancias.get(arista.destino)) {
                    distancias.put(arista.destino, nuevaDist);
                    cola.add(new Nodo(arista.destino, nuevaDist));
                }
            }
        }

        return distancias;
    }
}



