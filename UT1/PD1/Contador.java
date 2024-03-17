package Portfolio_Algoritmos.UT1.PD1;

public class Contador {
    private final int MAX_CONT = 50;
    private int incremento = 1;
    private int contador = 1;

    public void displayCount() {
        /*
         * while(contador <= MAX_CONT) {
         * System.err.println(contador);
         * contador+= incremento;
         * }
         */
        /*
         * do {
         * System.err.println(contador);
         * contador += incremento;
         * } while (contador <= MAX_CONT);
         */

        for (; contador <= MAX_CONT;) {
            System.err.println(contador);
            contador += incremento;
        }
    }
}