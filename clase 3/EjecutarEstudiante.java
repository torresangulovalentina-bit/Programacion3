import java.util.Arrays;

public class EjecutarEstudiante {
    public static void main(String[] args) {

        // Creacion de los objetos
        Estudiante objEst1 = new Estudiante(1, 1006720569, "Angelica", "ingenieria");
        Estudiante objEst2 = new Estudiante(2, 1001256512, "miguel", "ingenieria");
        Estudiante objEst3 = new Estudiante(3, 1000999111, "byron", "medicina");

        System.out.println(objEst1);

        // Creacion del arreglo de objetos ( EStudientes)
        Estudiante[] e = new Estudiante[4];

        e[0] = objEst1;
        e[1] = objEst2;
        e[2] = objEst3;
        e[3] = new Estudiante(4, 677676, "yuy", "ingenieria");

        System.out.println(Arrays.toString(e));
    }
}
