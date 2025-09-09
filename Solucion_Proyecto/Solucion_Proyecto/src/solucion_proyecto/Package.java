 
package solucion_proyecto;
import java.time.LocalDate;

 
public class Package {
    
    private final String id;
    private final String recipient;
    private final LocalDate date;
    private final int row;
    private final int col;
    private final boolean blocked;

    public Package(String id, String recipient, LocalDate date, int row, int col) {
        this.id = id;
        this.recipient = recipient;
        this.date = date;
        this.row = row;
        this.col = col;
        this.blocked = false;
    }

    private Package(int row, int col, boolean blocked) {
        this.id = "#BLOCKED#";
        this.recipient = "#";
        this.date = LocalDate.MIN;
        this.row = row;
        this.col = col;
        this.blocked = blocked;
    }

    public static Package blocked(int row, int col){
        return new Package(row, col, true);
    }
    
    public String getId() { return id; }
    public String getRecipient() { return recipient; }
    public LocalDate getDate() { return date; }
    public int getRow() { return row; }
    public int getCol() { return col; }
    public boolean isBlocked() { return blocked; }

    public String toDisplayString() {
        return String.format("ID: %s | Destinatario: %s | Fecha: %s | Casillero: (%d,%d)",
                id, recipient, date, row, col);
    }
}

   
