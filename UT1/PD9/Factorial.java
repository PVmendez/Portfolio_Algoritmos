package Portfolio_Algoritmos.UT1.PD9;

public class Factorial {
    public void calcularFactorial(int n) {

        if (n == 0) System.err.println("El factorial de 0 es 1");
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo");

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.err.println("El factorial de " + n + " es " + fact);
    }
    
}