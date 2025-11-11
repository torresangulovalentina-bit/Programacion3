 
package Taller_algoritmo_dijkstra;

 
public class Ordenamientos {
    
    
     
    // Método de ordenamiento Burbuja
    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // Intercambiar elementos
                    // si están en el orden incorrecto
                    // según sea necesario
                    // Aquí simplemente intercambiamos los elementos
                    // para ordenarlos en orden ascendente
                    // Puedes modificar la condición para orden descendente
                    // o para otros criterios de ordenamiento
                    // según sea necesario
                    
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pi = particion(arr, inicio, fin);
            quickSort(arr, inicio, pi - 1);
            quickSort(arr, pi + 1, fin);
            // Ordenar las particiones recursivamente
            // según sea necesario
            // Aquí simplemente aplicamos el algoritmo de Quick Sort
            // para ordenar el array en orden ascendente
            // Puedes modificar la lógica para otros criterios de ordenamiento
            // según sea necesario
    
        }
    }

    private static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = (inicio - 1);
        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Intercambiar elementos
                
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
        // Retornar el índice del pivote
        // después de la partición
        // según sea necesario
        // Aquí simplemente retornamos el índice del pivote
        // para continuar con el proceso de ordenamiento
        // Puedes modificar la lógica para otros criterios de ordenamiento
        // según sea necesario
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2;
            mergeSort(arr, inicio, medio);
            mergeSort(arr, medio + 1, fin);
            merge(arr, inicio, medio, fin);
            // Combinar las mitades ordenadas
            // según sea necesario
            // Aquí simplemente aplicamos el algoritmo de Merge Sort
            // para ordenar el array en orden ascendente
            
        }
    }

    private static void merge(int[] arr, int inicio, int medio, int fin) {
        int n1 = medio - inicio + 1;
        int n2 = fin - medio;
        // Crear arrays temporales

        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copiar datos a los arrays temporales

        for (int i = 0; i < n1; i++) L[i] = arr[inicio + i];
        for (int j = 0; j < n2; j++) R[j] = arr[medio + 1 + j];
        // Mezclar los arrays temporales de nuevo en arr[inicio..fin]
        // según sea necesario
        // Aquí simplemente combinamos los arrays temporales
        // para formar un array ordenado

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
            // Comparar y copiar el elemento más pequeño
            // según sea necesario
            // Aquí simplemente copiamos el elemento más pequeño
            // para mantener el orden ascendente
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
        // Copiar los elementos restantes
        // según sea necesario
        // Aquí simplemente copiamos los elementos restantes
        // de los arrays temporales al array original
        // para completar el proceso de ordenamiento
    }

    // Inserción
    public static void insercion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                // Mover elementos mayores a la derecha
                // según sea necesario
            }
            arr[j + 1] = key;
            //
        }
    }

    // Selección
    public static void seleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            //Recorre todo el arreglo posición por posición,
            // excepto la última (por eso va hasta arr.length - 1).
            // i representa la posición actual donde se colocará el menor elemento encontrado en la parte no ordenada.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
             //j recorre el resto del arreglo (desde i + 1 hasta el final)
             // buscando un elemento más pequeño que el que está en minIndex.
             //Si encuentra uno más pequeño, actualiza minIndex con ese nuevo índice.
             //Después de este bucle interno, minIndex contendrá el índice del elemento
             // más pequeño del subarreglo que va de i hasta el final.
                
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            //Una vez encontrado el elemento más pequeño, 
            //lo intercambia con el que está en la posición actual i.
            //Esto coloca el elemento más pequeño en su posición definitiva.
            
        }
    }
}
    

