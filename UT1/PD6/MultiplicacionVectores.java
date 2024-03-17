package Portfolio_Algoritmos.UT1.PD6;

public class MultiplicacionVectores {
    public static void main(String[] args) {
        int[] vector1 = { 2, 3, 4 };
        int[] vector2 = { 5, 6, 7 };

        if (vector1.length == vector2.length) {
            int resultado = multiplicarVectores(vector1, vector2);
            System.out.println("El resultado de la multiplicación de los vectores es: " + resultado);
        } else System.out.println("Los vectores no se pueden multiplicar.");
        
    }

    public static int multiplicarVectores(int[] vector1, int[] vector2) {
        int resultado = 0;
        for (int i = 0; i < vector1.length; i++) {
            resultado += vector1[i] * vector2[i];
        }
        return resultado;
    }
}

// Primero se verifica si los vectores son multiplicables segun sus longitudes, si es positivo, se va multiplicando numero a numero y se suma todo para tener el resultado. en caso
// negativo simplemente se indica que no se pueden multiplicar.