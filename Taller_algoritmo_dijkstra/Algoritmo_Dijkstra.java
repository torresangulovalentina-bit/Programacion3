 
package Taller_algoritmo_dijkstra;
import java.util.Arrays;

 

     
 public class Algoritmo_Dijkstra{
    public static void main(String[] args) {
        // Grafo representado como matriz de adyacencia
        int[][] grafo = {
            {0, 5, 0, 0, 0, 0, 0, 8, 0},
            {5, 0, 8, 0, 0, 0, 0, 12, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 13, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 13, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 12, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        // Crear el grafo y calcular distancias usando Dijkstra
        // desde el nodo 0
        // (puedes cambiar el nodo de inicio según sea necesario)
        

        Grafo g = new Grafo(grafo);
        int[] distancias = Dijkstra.calcularDistancias(g, 0);


        System.out.println("Distancias desde el nodo 0:");
        System.out.println(Arrays.toString(distancias));

        // Imprimir el camino más corto desde el nodo 0 a todos los demás nodos
        // (puedes implementar un método adicional para rastrear los caminos si es necesario)
        // Aquí solo se imprimen las distancias
        // Distancias desde el nodo 0:
        // [0, 4, 12, 19, 21, 11, 9, 8, 14]
        // Aquí puedes imprimir los caminos más cortos si lo deseas
        

        // Ejemplo de uso de métodos de ordenamiento
        int[] numeros = {64, 25, 12, 22, 11};
        System.out.println("\nArray original: " + Arrays.toString(numeros));

        // Aplicar diferentes métodos de ordenamiento
        // (puedes implementar métodos de ordenamiento adicionales si lo deseas)
        // Selección Directa
        

        // Ordenamiento por Burbuja
        Ordenamientos.burbuja(numeros);
        System.out.println("Burbuja: " + Arrays.toString(numeros));
        // Reiniciar el array para la siguiente prueba
        numeros = new int[]{64, 25, 12, 22, 11};

        // Quick Sort
        int[] arrQuick = {64, 25, 12, 22, 11};
        Ordenamientos.quickSort(arrQuick, 0, arrQuick.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arrQuick));

        // Merge Sort
        int[] arrMerge = {64, 25, 12, 22, 11};
        Ordenamientos.mergeSort(arrMerge, 0, arrMerge.length - 1);
        System.out.println("MergeSort: " + Arrays.toString(arrMerge));
        // Reiniciar el array para la siguiente prueba
        // Números para los otros métodos
        // Bubble Sort
        // Burbuja

        // Inserción
        int[] arrInsercion = {64, 25, 12, 22, 11};
        Ordenamientos.insercion(arrInsercion);
        System.out.println("Inserción: " + Arrays.toString(arrInsercion));

        // Selección
        int[] arrSeleccion = {64, 25, 12, 22, 11};
        Ordenamientos.seleccion(arrSeleccion);
        System.out.println("Selección: " + Arrays.toString(arrSeleccion));

        // Aquí puedes agregar más ejemplos de uso si lo deseas 
        // para otros métodos de ordenamiento
        // Quick Sort
        // Merge Sort
    }
}
        

    

