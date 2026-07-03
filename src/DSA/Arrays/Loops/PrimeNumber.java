package DSA.Arrays.Loops;

public class PrimeNumber {
    public static boolean primeNumber(int n) {
        // // Brute Force Approach in Java
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println("Is " + number + " prime? " +  primeNumber(number));
    }
}
