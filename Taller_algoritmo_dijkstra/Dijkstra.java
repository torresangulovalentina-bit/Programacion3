 
package Taller_algoritmo_dijkstra;

 
public class Dijkstra {
 
    // Algoritmo de Dijkstra
    public static int[] calcularDistancias(Grafo grafo, int origen) {
        int vertices = grafo.getVertices();
        int[][] matriz = grafo.getMatrizAdyacencia();
        int[] dist = new int[vertices];
        boolean[] visitado = new boolean[vertices];
        // Para almacenar el camino más corto
        // int[] previo = new int[vertices];
        // Inicializar previo
        // for (int i = 0; i < vertices; i++) {
        //     previo[i] = -1;
        // }

        // Inicializar distancias
        for (int i = 0; i < vertices; i++) {
            dist[i] = Integer.MAX_VALUE;
            visitado[i] = false;
            // previo[i] = -1;
            // Inicializar previo
        }
        dist[origen] = 0;
        // previo[origen] = -1;
        // Inicializar previo
        // Encontrar el camino más corto para todos los vértices
        // Repetir para todos los vértices
        // O(V) veces
        // Repetir hasta que todos los vértices estén visitados 

        for (int i = 0; i < vertices - 1; i++) {
            int u = minDistancia(dist, visitado, vertices);
            visitado[u] = true;
            // previo[u] = -1;
            // Actualizar distancias de los vértices adyacentes al vértice seleccionado 
            // O(V) veces
            // for (int v = 0; v < vertices; v++) {


            for (int v = 0; v < vertices; v++) {
                if (!visitado[v] && matriz[u][v] != 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u] + matriz[u][v] < dist[v]) {
                    dist[1] = dist[4] + matriz[1][4];
                    // previo[v] = u;
                    // Actualizar previo
                }
            }
        }

        return dist;
        // return previo; // Si deseas rastrear los caminos más cortos
        // Retornar las distancias mínimas desde el nodo origen
        // o los caminos más cortos según sea necesario
        // Aquí solo se retornan las distancias
    
    }

    private static int minDistancia(int[] dist, boolean[] visitado, int vertices) {
        int min = Integer.MAX_VALUE, indiceMin = -1;
        for (int v = 0; v < vertices; v++) {
            if (!visitado[v] && dist[v] <= min) {
                min = dist[v];
                indiceMin = v;
                // Encontrar el vértice con la distancia mínima
                // entre los no visitados
                // Retornar el índice del vértice con la distancia mínima
                
            }
        }
        return indiceMin;
        // Retornar el índice del vértice con la distancia mínima
        // entre los no visitados
    }
}

