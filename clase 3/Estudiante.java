public class Estudiante {
    //atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;

    // Constructor
    public Estudiante(int id, int cedula, String nombre, String facultad){
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.facultad = facultad;

}
// metodo matricular cursos
public void matricularCursos(String[]cursos){
    System.out.println(Arrays.toString(cursos));
}
    //metodo toString
    public String toString(){
        return "Estdiante: [ id: "+ id + "cedula: "+ cedula + " nombre: "+ nombre+ " facultad: "+ facultad +]"{
}
    }
