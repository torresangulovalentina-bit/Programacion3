package Recuperacion;

import java.util.*;

public class Grafo {
    private Map<String, List<Arista>> adyacencia;

    public Grafo() {
        adyacencia = new HashMap<>();
    }

    public void agregarCiudad(String ciudad) {
        adyacencia.putIfAbsent(ciudad, new ArrayList<>());
    }

    public void agregarRuta(String origen, String destino, int distancia) {
        adyacencia.get(origen).add(new Arista(destino, distancia));
        adyacencia.get(destino).add(new Arista(origen, distancia)); // si el grafo es no dirigido
    }

    public Map<String, List<Arista>> getAdyacencia() {
        return adyacencia;
    }
}

class Arista {
    String destino;
    int distancia;

    public Arista(String destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }
}
