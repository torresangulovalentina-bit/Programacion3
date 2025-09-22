package clase7;

import java.util.Stack;

public class pila {

    // creacion de una fila de numeros enteros 
    Stack<Integer> pila = new Stack<>();

    //verificar si la fila esta vacia 

    public pila() {
        // Verificar si la pila está vacía
        System.out.println(pila.empty());//true

        // Insertar elementos en la pila 
        pila.push(8);
        pila.push(4);
        pila.push(9);
        pila.push(10);
        pila.push(6);

        // imprimir la pila
        System.out.println("pila: " + pila);

        // mostrar el elemento que esta en el tope de la pila y removerlo
        System.out.println("elemento removido del tope de la pila: " + pila.pop());

        // imprimir la pila después de remover el elemento
        System.out.println("pila después de remover: " + pila);

        //Buscar y mostrar la posiscion del elemento dentro de la pila 
        System.out.println( pila.search(10));  
        System.out.println( pila.search(9)); 
        System.out.println( pila.search(4)); 
        System.out.println( pila.search(8)); 
        System.out.println( pila.search(50));  

         // Verificar si la pila está vacía
        System.out.println(pila.empty());//false

        //llamar al metodo para valiodar los parentesis
       Ejercicio1 ojOp = new Ejercicio1();
       String[] s = {"(", ")", "(", "(", ")", ")"};
       
    }
}

    

