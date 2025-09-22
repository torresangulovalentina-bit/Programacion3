package clase7;

import java.util.Stack;

public class Ejercicio1 {
     Stack<String> pilaSignos;


    public boolean validarParentesis(String[] s) {
        
        pilaSignos = new Stack<>();

        //Almacenar en la pila el arreglo de signos
        for (int i = 0; i < s.length; i++) {
            pilaSignos.push(s[i]);
        }

        int tam = pilaSignos.size();
        int cont1 = 0, cont2 = 0; 
        //recorrer la pila
        for (int i = 0; i < tam; i++) {
            if (pilaSignos.peek().equals("(")){
                cont1 += 1;
            }else{
                cont2 += 1;
            }
            pilaSignos.pop();
        }

        return cont1 == cont2 ? true : false;
    }

    /*
     * Tarea: Implementar todos los métodos de la clase Vector
     * https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
     * Realice ejemplos prácticos para validar su funcionamiento.
     */
}

