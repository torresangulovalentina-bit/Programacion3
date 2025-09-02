public class Libro {
    
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio){

        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }  
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public double getPrecio(){
        return precio;
    }
     @Override
        public String toString() {
            return "Libro:[titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
        }
     
        //calcular precio total de los libros en el arreglo
    public static double caltodo(Libro[]libros){
        double total =0.0;
         for(int i=0; i< libros.length; i++){
            total += libros[i].getPrecio();
         }
          return total;

    }

    public static void ordenLibro(Libro[] libros) {

        for (int i = 0; i < libros.length - 1; i++) { //controla el numero de pasadas
            for (int j = 0; j < libros.length - i - 1; j++) {
                if (libros[j].getPrecio() > libros[j + 1].getPrecio()) {
                    // intercambio de libros
                    Libro aux = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = aux;
                }
            }
        }
     }

}

