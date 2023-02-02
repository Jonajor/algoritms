public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 100) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
