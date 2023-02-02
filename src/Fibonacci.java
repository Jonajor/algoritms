public class Fibonacci {

    public static void main(String[] args) {
        int input = 10;
        int sequence = 0;
        int next = 1;
        int fibo;

        for (int i = 0; i < input; i++) {
            fibo = sequence + next;
            System.out.println("Sequence fibonacci: " + sequence);
            sequence = next;
            next = fibo;
        }
    }
}
