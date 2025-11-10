 
package algoritmo_dijkstra;

 
public class Dijkstra {
 
    // Algoritmo de Dijkstra
    public static int[] calcularDistancias(Grafo grafo, int origen) {
        int vertices = grafo.getVertices();
        int[][] matriz = grafo.getMatrizAdyacencia();
        int[] dist = new int[vertices];
        boolean[] visitado = new boolean[vertices];

        // Inicializar distancias
        for (int i = 0; i < vertices; i++) {
            dist[i] = Integer.MAX_VALUE;
            visitado[i] = false;
        }
        dist[origen] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int u = minDistancia(dist, visitado, vertices);
            visitado[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visitado[v] && matriz[u][v] != 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u] + matriz[u][v] < dist[v]) {
                    dist[v] = dist[u] + matriz[u][v];
                }
            }
        }

        return dist;
    }

    private static int minDistancia(int[] dist, boolean[] visitado, int vertices) {
        int min = Integer.MAX_VALUE, indiceMin = -1;
        for (int v = 0; v < vertices; v++) {
            if (!visitado[v] && dist[v] <= min) {
                min = dist[v];
                indiceMin = v;
            }
        }
        return indiceMin;
    }
}   
    
    
    

