 
package algoritmo_dijkstra;
import java.util.Arrays;

 

     
 public class Algoritmo_Dijkstra{
    public static void main(String[] args) {
        // Grafo representado como matriz de adyacencia
        int[][] grafo = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        Grafo g = new Grafo(grafo);
        int[] distancias = Dijkstra.calcularDistancias(g, 0);

        System.out.println("Distancias desde el nodo 0:");
        System.out.println(Arrays.toString(distancias));

        // Ejemplo de uso de métodos de ordenamiento
        int[] numeros = {64, 25, 12, 22, 11};
        System.out.println("\nArray original: " + Arrays.toString(numeros));

        // Ordenamiento por Burbuja
        Ordenamientos.burbuja(numeros);
        System.out.println("Burbuja: " + Arrays.toString(numeros));

        // Quick Sort
        int[] arrQuick = {64, 25, 12, 22, 11};
        Ordenamientos.quickSort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arrQuick));

        // Merge Sort
        int[] arrMerge = {64, 25, 12, 22, 11};
        Ordenamientos.mergeSort(arrMerge, 0, arrMerge.length - 1);
        System.out.println("MergeSort: " + Arrays.toString(arrMerge));

        // Inserción
        int[] arrInsercion = {64, 25, 12, 22, 11};
        Ordenamientos.insercion(arrInsercion);
        System.out.println("Inserción: " + Arrays.toString(arrInsercion));

        // Selección
        int[] arrSeleccion = {64, 25, 12, 22, 11};
        Ordenamientos.seleccion(arrSeleccion);
        System.out.println("Selección: " + Arrays.toString(arrSeleccion));
    }
}
        

    

