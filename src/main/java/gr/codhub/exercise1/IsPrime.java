package gr.codhub.exercise1;

public class IsPrime {
    public static boolean isPrime(int n) {
        int factors = 0;
        int j = 1;

        while (j <= n) {
            if (n % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
}
