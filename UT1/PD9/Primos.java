package Portfolio_Algoritmos.UT1.PD9;

public class Primos {
    public static boolean isPrime(long n) {
        
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int calculateSum(int n, boolean isEven) {
        int sum = 0;
        int start = isEven ? 2 : 1;
        while (start <= n) {
            sum += start;
            start += 2;
        }
        return sum;
    }
}
