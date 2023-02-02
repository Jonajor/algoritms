public class CheckEvenNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};

        int cont = 0;
        while (cont <= numbers.length - 1) {
            if (numbers[cont] % 2 == 0) {
                System.out.println("Is even: " + numbers[cont]);
            }
            cont++;
        }
    }
}
