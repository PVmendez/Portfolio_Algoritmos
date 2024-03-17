package Portfolio_Algoritmos.UT1.PD10;

public class main {
    public static void main(String[] args) {
        String[] Ar1 = { "Hola", "mundo", "de", "los", "algoritmos" };
        String[] Ar2 = { "Hola", "mundo", "de", "la", "informática" };
        for (String resultado : ContadorPalabras.palabrasEnComun(Ar1, Ar2)) {
            System.err.println(resultado);
        }
    }
}
