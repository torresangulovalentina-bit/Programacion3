
public class EjecutarLibro{
    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
    Libro [] libros = new Libro[5];

    libros[0] = new Libro("El Quijote", "Miguel de Cervantes", 16.50);
    libros[1] = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 19.600);
    libros[2] = new Libro("1984", "George Orwell", 19.400);
    libros[3] = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 20.000);
    libros[4] = new Libro("El Principito", "Antoine de Saint-Exupéry", 21.300);

    double precioTotal= libros[0].caltodo(libros);
    System.out.println("EL precio total del los libros es: "+ precioTotal);

    libros[0].ordenLibro(libros);
    System.out.println("libros de menor a mayor precio: ");
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }

    }
}


