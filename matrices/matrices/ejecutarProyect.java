import javax.swing.JOptionPane;

    public class ejecutarProyect {
    public static void main(String[] args) {
       

        Casillero casillero = new Casillero(3, 4); // matriz de 3 filas x 4 columnas(casillero con 12 apartados)
        int opcion=0;

         while (opcion != 4) {
             String menu = "=== MENÚ PRINCIPAL ===\n"
                        + "1. Registrar paquete en casillero\n"
                        + "2. Consultar casilleros disponibles\n"
                        + "3. Información de paquetes\n"
                        + "4. Salir\n"
                        + "Seleccione una opción:";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    String fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso (D/M/A):");
                    String destinatario = JOptionPane.showInputDialog("Ingrese nombre del destinatario:");
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila del casillero: "));
                    int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna del casillero: "));

                     miniProyect.Paquete paquete = new Paquete(destinatario, fechaIngreso);
                    casillero.asignarPaquete(fila, columna, paquete);
                    break;

                case 2:
                    casillero.mostrarDisponibles();
                    break;

                case 3:
                    casillero.mostrarInformacion();
                    break;

                case 4:
                    JOptionPane.showMessageDialog( null,"✅ Aplicación finalizada.");
                    break;

                default:
                    JOptionPane.showMessageDialog( null, "Opción inválida.");
            }

        } 

    }
}//fin main

