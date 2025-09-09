 
package solucion_proyecto;

import java.util.Scanner;

 import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LockerSystem {
 
    
 
    
    private Package[][] lockers;
    private final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static final String[] DISABLED_SLOTS = new String[] {
        // "0,0", "2,5" 
    };

    public LockerSystem(int rows, int cols) {
        lockers = new Package[rows][cols];
        applyDisabledSlots();
    }

    private void applyDisabledSlots() {
        for (String s : DISABLED_SLOTS) {
            String[] rc = s.split(",");
            int r = Integer.parseInt(rc[0].trim());
            int c = Integer.parseInt(rc[1].trim());
            if (isInside(r,c)) {
                lockers[r][c] = Package.blocked(r, c);
            }
        }
    }

    public void run() {
        boolean keep = true;
        while (keep) {
            printMenu();
            int opt = readInt("Seleccione una opción: ");
            switch (opt) {
                case 1: registerPackage(); break;
                case 2: showAvailableLockers(); break;
                case 3: showPackagesInfo(); break;
                case 4:
                    println("\nCerrando aplicación... ¡Hasta pronto!");
                    keep = false;
                    break;
                default:
                    warn("Opción no válida.");
            }
        }
    }

    private void printMenu() {
        println("\n===== MENÚ PRINCIPAL =====");
        println("1. Registro de paquetes en el casillero");
        println("2. Consulta de casilleros disponibles");
        println("3. Información de cada paquete (fecha de ingreso y destinatario)");
        println("4. Cerrar aplicación");
    }

    private void registerPackage() {
        println("\n--- Registro de Paquete ---");
        String recipient = readLine("Destinatario: ").trim();
        if (recipient.isEmpty()) {
            warn("El destinatario no puede estar vacío.");
            return;
        }
        String id = readLine("Identificador del paquete (código/guía): ").trim();
        if (id.isEmpty()) {
            warn("El identificador no puede estar vacío.");
            return;
        }
        LocalDate date = readDate("Fecha de ingreso (formato yyyy-MM-dd, ENTER para hoy): ");

        println("\nEsquema de casilleros ( [ ] disponible, [X] ocupado, [#] no disponible ):");
        drawLockers();

        println("\n1) Asignación automática (primer puesto libre)");
        println("2) Elegir manualmente (fila, columna)");
        int choice = readInt("Seleccione: ");
        int[] pos;
        if (choice == 2) {
            int r = readInt("Fila (0-" + (lockers.length - 1) + "): ");
            int c = readInt("Columna (0-" + (lockers[0].length - 1) + "): ");
            pos = new int[]{r, c};
            if (!isInside(r, c)) {
                warn("Posición fuera de rango.");
                return;
            }
            if (!isFree(r, c)) {
                warn("Ese casillero no está disponible.");
                return;
            }
        } else {
            pos = findFirstFree();
            if (pos == null) {
                warn("No hay casilleros disponibles.");
                return;
            }
        }

        int r = pos[0], c = pos[1];
        lockers[r][c] = new Package(id, recipient, date, r, c);
        println("Paquete asignado exitosamente al casillero (" + r + "," + c + ").");
    }

    private void showAvailableLockers() {
        println("\n--- Consulta de casilleros disponibles ---");
        int count = 0;
        for (int r = 0; r < lockers.length; r++) {
            for (int c = 0; c < lockers[r].length; c++) {
                if (isFree(r, c)) count++;
            }
        }
        drawLockers();
        println("Disponibles: " + count + " | Ocupados: " + occupiedCount() + " | No disponibles: " + blockedCount());
    }

    private void showPackagesInfo() {
        println("\n--- Información de Paquetes ---");
        Package[] arr = toFlatArray();
        if (arr.length == 0) {
            warn("No hay paquetes registrados.");
            return;
        }
        println("Ordenar por: 1) Fecha  2) Destinatario  3) Identificador");
        int mode = readInt("Seleccione: ");
        bubbleSort(arr, mode);
        for (Package p : arr) {
            println(p.toDisplayString());
        }
    }

    private int occupiedCount() {
        int count = 0;
        for (int r = 0; r < lockers.length; r++) {
            for (int c = 0; c < lockers[r].length; c++) {
                if (lockers[r][c] != null && !lockers[r][c].isBlocked()) count++;
            }
        }
        return count;
    }

    private int blockedCount() {
        int count = 0;
        for (int r = 0; r < lockers.length; r++) {
            for (int c = 0; c < lockers[r].length; c++) {
                if (lockers[r][c] != null && lockers[r][c].isBlocked()) count++;
            }
        }
        return count;
    }

    private void drawLockers() {
        for (int r = 0; r < lockers.length; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < lockers[r].length; c++) {
                if (lockers[r][c] == null) sb.append("[ ]");
                else if (lockers[r][c].isBlocked()) sb.append("[#]");
                else sb.append("[X]");
            }
            println(sb.toString() + "  <- fila " + r);
        }
        StringBuilder cols = new StringBuilder("    ");
        for (int c = 0; c < lockers[0].length; c++) cols.append(c).append("  ");
        println(cols.toString());
    }

    private boolean isInside(int r, int c) {
        return r >= 0 && r < lockers.length && c >= 0 && c < lockers[0].length;
    }

    private boolean isFree(int r, int c) {
        return isInside(r, c) && lockers[r][c] == null;
    }

    private int[] findFirstFree() {
        for (int r = 0; r < lockers.length; r++) {
            for (int c = 0; c < lockers[r].length; c++) {
                if (isFree(r, c)) return new int[]{r, c};
            }
        }
        return null;
    }

    private Package[] toFlatArray() {
        int n = occupiedCount();
        Package[] arr = new Package[n];
        int idx = 0;
        for (int r = 0; r < lockers.length; r++) {
            for (int c = 0; c < lockers[r].length; c++) {
                if (lockers[r][c] != null && !lockers[r][c].isBlocked()) {
                    arr[idx++] = lockers[r][c];
                }
            }
        }
        return arr;
    }

    private void bubbleSort(Package[] arr, int mode) {
        boolean swapped = true;
        int n = arr.length;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (compare(arr[i-1], arr[i], mode) > 0) {
                    Package tmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = tmp;
                    swapped = true;
                }
            }
            n--;
        }
    }

    private int compare(Package a, Package b, int mode) {
        switch (mode) {
            case 1: return a.getDate().compareTo(b.getDate());
            case 2: return a.getRecipient().compareToIgnoreCase(b.getRecipient());
            case 3: 
            default:
                return a.getId().compareToIgnoreCase(b.getId());
        }
    }

    private LocalDate readDate(String prompt) {
        String raw = readLine(prompt);
        if (raw == null || raw.trim().isEmpty()) {
            return LocalDate.now();
        }
        try {
            return LocalDate.parse(raw.trim(), DF);
        } catch (DateTimeParseException e) {
            warn("Formato inválido. Use yyyy-MM-dd. Se usará la fecha de hoy.");
            return LocalDate.now();
        }
    }

    private int readInt(String prompt) {
        while (true) {
            try {
                print(prompt);
                String s = scanner.nextLine();
                return Integer.parseInt(s.trim());
            } catch (Exception e) {
                warn("Ingrese un número válido.");
            }
        }
    }

    private String readLine(String prompt) {
        print(prompt);
        return scanner.nextLine();
    }

    private void println(String s) { System.out.println(s); }
    private void print(String s) { System.out.print(s); }
    private void warn(String s) { System.out.println("⚠ " + s); }
}


