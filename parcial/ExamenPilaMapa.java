
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ExamenPilaMapa {
    static class PilaEnteros {
        private int[] datos;
        private int tope; // -1 si est vaca

        public PilaEnteros(int capacidad) {
            datos = new int[capacidad];
            tope = -1;

           
        }

        public boolean estaVacia() {
            return tope == -1;

            //metodo que devuelve true si la pila esta vacia
        }

        public boolean estaLlena() {
            return tope + 1 == datos.length;

            // devuelve true si la pila esta llena 
            
        }

        public void apilar(int x) {
            if (estaLlena())
                throw new IllegalStateException(" Pila llena");
            tope++;
            datos[tope] = x;

            //metodo para apilar(push)un entero en la pila
           
        }

        public int desapilar() {
            if (estaVacia())
                throw new IllegalStateException(" Pila vacia ");
            int v = datos[tope];
            tope--;
            return v;

            //metodo para desapilar(pop) un entero de la pila
            
        }
    }

    // (50 pts ) Verifica si los parntesises estan balanceados .
    public static boolean esBalanceado(String s) {
        // implementar usando PilaEnteros

        PilaEnteros pila = new PilaEnteros(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);// lee caracter en forma de cadena
            if (c == '(') {
                pila.apilar(1);// marcador de apertura
            } else if (c == ')') {
                if (pila.estaVacia()) {
                    return false; // Aqui cierra la apertura
                } else { // ejecuta un bloqueo
                    pila.desapilar(); // la elimina o la cierra

                }
            }
        }
        return pila.estaVacia(); // si queda algo en la pila no esta balanceado
    }

    // (50 pts ) Actualiza la calificacion si existe el id y esta en rango 0..100.
 public static boolean actualizarCalificacion ( Map < Integer , Integer >califPorId , int id , int nuevo ) {
  // validar rango , existencia y actualizar


      if(nuevo >= 0 && nuevo <= 100){
        System.out.println(" La calificacion esta DENTRO del rango 0..100");

        if(califPorId.containsKey(id)){ //verifica si un HashMap contiene una clave especifica
            System.out.println(" El id fue encontrado en el mapa");

            califPorId.put(id, nuevo); //actualiza la calificacion
            System.out.println(" Calificacion actualizada para el id: " + id + " , " + nuevo);
            return true;
        }

 return true;
      }
      return false;

 }


 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String cadena = sc.nextLine(); // lee una linea completa en cadena
     System.out.println(" Balanceado : " + esBalanceado(cadena));

     Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
     mapa.put(101, 70);
     mapa.put(102, 85);
     System.out.println(" Actualizado : " + actualizarCalificacion(mapa, 101, 95));
     System.out.println(" Actualizado : " + actualizarCalificacion(mapa, 103, 90));


     sc.close();
     
 }
}
