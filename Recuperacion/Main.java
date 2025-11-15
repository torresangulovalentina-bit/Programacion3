package Recuperacion;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        // Agregar ciudades
        grafo.agregarCiudad("Cali");
        grafo.agregarCiudad("Medellin");
        grafo.agregarCiudad("Bogota");
        grafo.agregarCiudad("Bucaramanga");
        grafo.agregarCiudad("Cartagena");

        // Agregar rutas (distancias aproximadas)
        grafo.agregarRuta("Cali", "Medellin", 420);
        grafo.agregarRuta("Medellin", "Bogota", 415);
        grafo.agregarRuta("Bogota", "Bucaramanga", 400);
        grafo.agregarRuta("Bucaramanga", "Cartagena", 635);
        grafo.agregarRuta("Medellin", "Cartagena", 640);

        // Ejecutar Dijkstra desde Cali
        var distancias = Dijkstra.calcularDistancias(grafo, "Cali");

        // Mostrar resultado
        System.out.println("Distancia más corta desde Cali hasta cada ciudad:");
        distancias.forEach((ciudad, distancia) -> {
            System.out.println(ciudad + ": " + distancia + " km");
        });

        System.out.println("\nLa distancia más corta de Cali a Cartagena es: " +
                distancias.get("Cartagena") + " km");
    }
}
