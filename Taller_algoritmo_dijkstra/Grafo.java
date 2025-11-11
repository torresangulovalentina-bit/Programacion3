 
package Taller_algoritmo_dijkstra;

 
public class Grafo {
    
    // Matriz de adyacencia del grafo
    // Número de vértices en el grafo
    // Constructor y métodos para acceder a la matriz y al número de vértices
    // según sea necesario

    private final int[][] matrizAdyacencia;
    private final int vertices; 
    // Constructor
    // Inicializar la matriz de adyacencia y el número de vértices
    // del grafo
    // según sea necesario


    public Grafo(int[][] matrizAdyacencia) {
        this.matrizAdyacencia = matrizAdyacencia;
        this.vertices = matrizAdyacencia.length;
        // Asumimos que la matriz es cuadrada
        // por lo que el número de vértices es la longitud de la matriz
        // de adyacencia
        
    }

    public int[][] getMatrizAdyacencia() {
        return matrizAdyacencia;
        // Retornar la matriz de adyacencia del grafo
        // según sea necesario
        // Aquí simplemente retornamos la matriz almacenada
        // en el objeto Grafo
        
    }

    public int getVertices() {
        return vertices;
        // Retornar el número de vértices en el grafo
        // según sea necesario
        // Aquí simplemente retornamos el valor almacenado
        // en el objeto Grafo
    }
}


