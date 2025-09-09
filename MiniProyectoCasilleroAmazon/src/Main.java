import java.util.Scanner;

class SistemaCasilleros {
    private Paquete[][] casilleros;
    private final Scanner lector = new Scanner(System.in);

    // Para simular no todos los casilleros son iguales se deshabilitan algunas posiciones
    private static final String[] POSICIONES_DESHABILITADAS = new String[] {
        // "0,0", "2,5" // descomente para deshabilitar posiciones específicas
    };

    public SistemaCasilleros(int filas, int columnas) {
        casilleros = new Paquete[filas][columnas];
        aplicarPosicionesDeshabilitadas();
    }

    private void aplicarPosicionesDeshabilitadas() {//se encarga de deshabilitar posiciones específicas en la matriz de casilleros simulando que algunos no están disponibles
        for (String posicion : POSICIONES_DESHABILITADAS) {
            String[] filaColumna = posicion.split(",");
            int fila = Integer.parseInt(filaColumna[0].trim());
            int columna = Integer.parseInt(filaColumna[1].trim());
            if (estaDentroRango(fila, columna)) {
                casilleros[fila][columna] = Paquete.bloqueado(fila, columna);
            }
        }
    }

    public void ejecutar() {// mantiene la aplicación en funcionamiento hasta que el usuario decida salir
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1: registrarPaquete(); break;
                case 2: mostrarCasillerosDisponibles(); break;
                case 3: mostrarInformacionPaquetes(); break;
                case 4:
                    System.out.println("\nCerrando aplicación... ¡Hasta pronto!");
                    continuar = false;
                    break;
                default:
                    System.out.println("⚠ " + "Opción no válida.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Registro de paquetes en el casillero");
        System.out.println("2. Consulta de casilleros disponibles");
        System.out.println("3. Información de cada paquete (fecha de ingreso y destinatario)");
        System.out.println("4. Cerrar aplicación");
    }

    private void registrarPaquete() {//se encarga de registrar un paquete en un casillero
        System.out.println("\n--- Registro de Paquete ---");
        String destinatario = leerLinea("Destinatario: ").trim();
        if (destinatario.isEmpty()) {
            System.out.println("⚠ " + "El destinatario no puede estar vacío.");
            return;
        }
        String identificador = leerLinea("Identificador del paquete (código/guía): ").trim();
        if (identificador.isEmpty()) {
            System.out.println("⚠ " + "El identificador no puede estar vacío.");
            return;
        }
       String fechaIngreso = leerLinea("Fecha de ingreso(ejemplo:D/M/A): ");

        // Mostrar esquema y permitir elección manual o automática
        System.out.println("\nEsquema de casilleros ( [ ] disponible, [X] ocupado, [#] no disponible ):");
        dibujarCasilleros();

        System.out.println("\n1) Asignación automática (primer puesto libre)");
        System.out.println("2) Elegir manualmente (fila, columna)");
        int eleccion = leerEntero("Seleccione: ");
        int[] posicion;
        if (eleccion == 2) {
            int fila = leerEntero("Fila (0-" + (casilleros.length - 1) + "): ");
            int columna = leerEntero("Columna (0-" + (casilleros[0].length - 1) + "): ");
            posicion = new int[]{fila, columna};
            if (!estaDentroRango(fila, columna)) {
                System.out.println("⚠ " + "Posición fuera de rango.");
                return;
            }
            if (!estaLibre(fila, columna)) {
                System.out.println("⚠ " + "Ese casillero no está disponible.");
                return;
            }
        } else {
            posicion = buscarPrimerLibre();
            if (posicion == null) {
                System.out.println("⚠ " + "No hay casilleros disponibles.");
                return;
            }
        }

        int fila = posicion[0], columna = posicion[1];
         casilleros[fila][columna] = new Paquete(identificador, destinatario, fechaIngreso, fila, columna);
        System.out.println("Paquete asignado exitosamente al casillero (" + fila + "," + columna + ").");
    }

    private void mostrarCasillerosDisponibles() {
        System.out.println("\n--- Consulta de casilleros disponibles ---");
        int disponibles = 0;
        for (int fila = 0; fila < casilleros.length; fila++) {
            for (int columna = 0; columna < casilleros[fila].length; columna++) {
                if (estaLibre(fila, columna)) disponibles++;
            }
        }
        dibujarCasilleros();
        System.out.println("Disponibles: " + disponibles + " | Ocupados: " + contarOcupados() + " | No disponibles: " + contarBloqueados());
    }

    private void mostrarInformacionPaquetes() {
        System.out.println("\n--- Información de Paquetes ---");
        Paquete[] arregloPaquetes = convertirArregloPlano();
        if (arregloPaquetes.length == 0) {
            System.out.println("⚠ " + "No hay paquetes registrados.");
            return;
        }
        System.out.println("Ordenar por: 1) Fecha  2) Destinatario  3) Identificador");
        int modoOrden = leerEntero("Seleccione: ");
        ordenarBurbuja(arregloPaquetes, modoOrden);//modoOrden
        for (Paquete paquete : arregloPaquetes) {
            System.out.println(paquete.CadenaMostrar());
        }
    }

    private int contarOcupados() {//cuenta cuantos casilleros estan ocupados
        int ocupados = 0;
        for (int fila = 0; fila < casilleros.length; fila++) {
            for (int columna = 0; columna < casilleros[fila].length; columna++) {
                if (casilleros[fila][columna] != null && !casilleros[fila][columna].estaBloqueado()) ocupados++;
            }
        }
        return ocupados;
    }

    private int contarBloqueados() {//cuenta cuantos casilleros estan bloqueados
        int bloqueados = 0;
        for (int fila = 0; fila < casilleros.length; fila++) {
            for (int columna = 0; columna < casilleros[fila].length; columna++) {
                if (casilleros[fila][columna] != null && casilleros[fila][columna].estaBloqueado()) bloqueados++;
            }
        }
        return bloqueados;
    }
    //se encarga de imprimir en la consola la forma visual de la matriz 
    private void dibujarCasilleros() {
        for (int fila = 0; fila < casilleros.length; fila++) {
            String sb = "";
            for (int columna = 0; columna < casilleros[fila].length; columna++) {
                if (casilleros[fila][columna] == null) sb += "[ ]";
                else if (casilleros[fila][columna].estaBloqueado()) sb += "[#]";
                else sb += "[X]";
            }
            System.out.println(sb + "  <- fila " + fila);
        }
        String columnas = "";
        for (int columna = 0; columna < casilleros[0].length; columna++) columnas += columna + "  ";
        System.out.println(columnas);
    }

    private boolean estaDentroRango(int fila, int columna) {//verifica si la fila y columna estan dentro del rango del arreglo
        return fila >= 0 && fila < casilleros.length && columna >= 0 && columna < casilleros[0].length;
    }

    private boolean estaLibre(int fila, int columna) {//verifica si la posicion del casillero esta libre (dentro del rango y nula)
        return estaDentroRango(fila, columna) && casilleros[fila][columna] == null;
    }
    
    private int[] buscarPrimerLibre() {//busca la primera posición libre en el arreglo de casilleros
        for (int fila = 0; fila < casilleros.length; fila++) {
            for (int columna = 0; columna < casilleros[fila].length; columna++) {
                if (estaLibre(fila, columna))//si el casillero esta libre, devuelve la posicion
                 return new int[]{fila, columna};//retorna la fila y columna del primer casillero libre, si no hay ninguno retorna null
            }
        }
        return null;
    }

    private Paquete[] convertirArregloPlano() {
        int cantidad = contarOcupados();//llama al metod contar ocupados para determinar el tamaño exacto del arreglo
        Paquete[] arreglo = new Paquete[cantidad];
        int indice = 0;
        for (int fila = 0; fila < casilleros.length; fila++) {
            for (int columna = 0; columna < casilleros[fila].length; columna++) {
                if (casilleros[fila][columna] != null && !casilleros[fila][columna].estaBloqueado()) {
                    arreglo[indice++] = casilleros[fila][columna];
                    //verifica que el casillero no este bloqueado y que no sea nulo antes de agregarlo al arreglo
                }
            }
        }
        return arreglo;
    }

    /**
     * Ordenamiento Burbuja para ordenar los paquetes según el modo:
     * 1 = fecha, 2 = destinatario, 3 = identificador.
     */
   private void ordenarBurbuja(Paquete[] arreglo, int modo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparar(arreglo[j], arreglo[j + 1], modo) > 0) {
                    Paquete temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }

    private int comparar(Paquete paqueteA, Paquete paqueteB, int modo) {
        switch (modo) {
            //se usa el compareToIgnoreCase para ignorar mayusculas y minusculas y se usa para ordenar (por el metodo burbuja)
            case 1: // fecha
                return paqueteA.obtenerFecha().compareTo(paqueteB.obtenerFecha());
            case 2: // destinatario
                return paqueteA.obtenerDestinatario().compareToIgnoreCase(paqueteB.obtenerDestinatario());
            case 3: // identificador
            default:
                return paqueteA.obtenerIdentificador().compareToIgnoreCase(paqueteB.obtenerIdentificador());
        }
    }


    private int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = lector.nextLine().trim();
            if (esNumeroValido(entrada)) {
                return Integer.parseInt(entrada);
            } else {
                System.out.println("Ingrese un número válido.");
            }
        }
    }

    private boolean esNumeroValido(String cadena) {
       
        return cadena.matches("-?\\d+");
    }

    private String leerLinea(String mensaje) {
        System.out.print(mensaje);
        return lector.nextLine();
    }


static class Paquete {
    private final String identificador;
    private final String destinatario;
    private final String fechaIngreso;
    private final int fila;
    private final int columna;
    private final boolean bloqueado;

    public Paquete(String identificador, String destinatario, String fechaIngreso, int fila, int columna) {
        this.identificador = identificador;
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso;
        this.fila = fila;
        this.columna = columna;
        this.bloqueado = false;
    }

    private Paquete(int fila, int columna, boolean bloqueado) {
        this.identificador = "#BLOQUEADO#";
        this.destinatario = "#";
        this.fechaIngreso = "";
        this.fila = fila;
        this.columna = columna;
        this.bloqueado = bloqueado;
    }

    public static Paquete bloqueado(int fila, int columna) {
        return new Paquete(fila, columna, true);
    }

    //permite acceder a los datos del paquete y mostrar la información
    public String obtenerIdentificador() { 
        return identificador; }
    public String obtenerDestinatario() {
         return destinatario; }
    public String obtenerFecha() {
         return fechaIngreso; }
    public int obtenerFila() {
         return fila; }
    public int obtenerColumna() {
         return columna; }
    public boolean estaBloqueado() {
         return bloqueado; }
//resume la informacion relevante del paquete
    public String CadenaMostrar() {
         return "ID: " + identificador +
               " | Destinatario: " + destinatario +
               " | Fecha: " + fechaIngreso +
               " | Casillero: (" + fila + "," + columna + ")";
    } 
}
}
