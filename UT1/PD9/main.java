package Portfolio_Algoritmos.UT1.PD9;

public class main {
    public static void main(String[] args) {
        //Ejercicio 1
        int n = -3;
        Factorial fact = new Factorial();

        try {
            fact.calcularFactorial(n);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //Ejercicio 2
        int x = 10;
        Primos p = new Primos();
        
        if (isPrime(n)) System.out.println(p.calculateSum(x, true));
        else System.out.println(p.calculateSum(x, false));
    }
}
