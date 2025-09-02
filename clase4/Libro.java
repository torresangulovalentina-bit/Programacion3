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
    public static double calcularPrecioTol(Libro[]libros){
        double total =0.0;
         for(int i=0; i< libros.length; i++){
            total += libros[i].getPrecio();
         }
          return total;
    }
}
