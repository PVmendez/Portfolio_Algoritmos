package Portfolio_Algoritmos.UT1.PD7;

public class EJ1 {
    public static void main(String[] args) {
        String s = "1";
        while (s != "1000") {
            s += "0";
        }

        // El tema es que en Java el '==' compara referencias a objetos, no valores literales, por lo que aunque compartan el mismo valor nunca va a dar true.
        // En C# si daria true ya que puede comparar directamente el contenido
    }
}
