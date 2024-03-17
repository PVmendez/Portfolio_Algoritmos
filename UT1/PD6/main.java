package Portfolio_Algoritmos.UT1.PD6;

public class main {
    public static void main(String[] args) {
        Tablero.imprimirTablero(3, 3);
        LeerEntrada.leerEntradaStdin();
        LeerArchivo.leerEntradaArchivo("./entrada.txt");

        TextoT9.transformarTextoT9("./entrada.txt");
        TextoT9.transformarT9Texto("./entrada.txt");
    }
}
