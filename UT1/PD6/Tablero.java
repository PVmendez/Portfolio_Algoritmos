package Portfolio_Algoritmos.UT1.PD6;

public class Tablero {
    public static void imprimirTablero(int largo, int ancho) {
        for (int i = 0; i < largo; i++) {
            for (int j = 1; j < ancho; j++) {
                System.err.print("#");
            }
            System.err.println("#");
        }

    }
}
