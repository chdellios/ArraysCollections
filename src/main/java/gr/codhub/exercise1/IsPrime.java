package gr.codhub.exercise1;

public class IsPrime {
    public static boolean isPrime(int n) {
        boolean flag = true;
        //int upto = (int) (Math.sqrt(n) + 1);
        if (n == 2) {
            flag = true;
        } else if (n % 2 == 0) {
            flag = false;
        } else {
            for (int j = 3; j < n / 2; j += 2) {
                if (n % j == 0)
                    flag = false;
            }
        }
        return flag;
    }
}