package Portfolio_Algoritmos.UT1.PD7;

public class EJ2 {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";
        if (s1 == s2) System.out.println("True");
        else System.out.println("False");

        // En la primera devuelve "True" ya que al crear dos strings literalmente iguales, Java los hace apuntar al mismo objeto, por lo que cumplirian la condicion.

        String s3 = new String("Hola");
        String s4 = "Hola";
        if (s3 == s4) System.out.println("True");
        else System.out.println("False");

        // Luego en esta devuelve "False" ya que al usar new crea una instancia del objeto String y lo reserva en memoria en otro lado no igual al de la cadena literal.
    }
}

// El metodo Intern basicamente recupera del string pool la referencia a una cadena si ya existe o la agrega en caso de no existir.

// String.Intern(String) Method - https://learn.microsoft.com/en-us/dotnet/api/system.string.intern?view=net-8.0
