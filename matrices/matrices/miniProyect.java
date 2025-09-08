

import javax.swing.JOptionPane;
public class miniProyect {

class Paquete {
    private String destinatario;
    private String fechaIngreso;

    public Paquete(String destinatario, String fechaIngreso) {
        this.destinatario = destinatario;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDestinatario() {
        return destinatario;
    }

     public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Destinatario: " + destinatario + ", Fecha ingreso: " + getFechaIngreso();
    }
}

class Casillero {
    private Paquete[][] casilleros;

    public Casillero(int filas, int columnas) {
        casilleros = new Paquete[filas][columnas];
    }

     public boolean asignarPaquete(int fila, int columna, Paquete paquete) {
        if (fila < 0 || fila >= casilleros.length || columna < 0 || columna >= casilleros[0].length) {
            JOptionPane.showMessageDialog(null, "❌ Posición fuera de rango.");
            return false;//comprueba que los valores de fila y columna esten dentro del rango de la matriz y si no lo esta muestra un mensaje de error.
        }
        if (casilleros[fila][columna] == null) {
            casilleros[fila][columna] = paquete;//Aquí se registra el paquete en la matriz
            JOptionPane.showMessageDialog(null, "✅ Paquete registrado en [" + fila + "][" + columna + "]");
            return true;//Si el casillero en esa posición es null (libre), asigna el paquete, muestra el mensaje y retorna true.

        } else {
            JOptionPane.showMessageDialog(null, "⚠ Casillero ya ocupado.");
            return false;//Si ya hay un paquete en esa posición, muestra un mensaje indicando que está ocupado y retorna false.
        }
    }

    public void mostrarInformacion() {
       //aqui se hace el recorrido de la matriz para imprimir la informacion de los paquetes

        StringBuilder info = new StringBuilder("📋 Información de paquetes:\n");
            boolean hayPaquetes = false;

            for (int i = 0; i < casilleros.length; i++) {
                for (int j = 0; j < casilleros[i].length; j++) {
                    if (casilleros[i][j] != null) {
                        hayPaquetes = true;
                        info.append("[").append(i).append("][").append(j).append("] → ")
                            .append(casilleros[i][j].toString()).append("\n");
                    }
                }
            }

            if (!hayPaquetes) {
                info.append("⚠ No hay paquetes registrados.");
            }

            JOptionPane.showMessageDialog(null, info.toString());

    }

}  

}//fin clase principal

