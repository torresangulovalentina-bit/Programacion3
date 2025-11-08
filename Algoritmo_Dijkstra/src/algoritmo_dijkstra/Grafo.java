 
package algoritmo_dijkstra;

 
public class Grafo {
    
    
    private final int[][] matrizAdyacencia;
    private final int vertices;

    public Grafo(int[][] matrizAdyacencia) {
        this.matrizAdyacencia = matrizAdyacencia;
        this.vertices = matrizAdyacencia.length;
    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
    }

    public int getVertices() {
        return vertices;
    }
}


