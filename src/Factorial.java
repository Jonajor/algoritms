public class Factorial {
    public static int findFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * findFactorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = findFactorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}
