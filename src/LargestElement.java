public class LargestElement {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 11, 45, 2};

        int largest = Integer.MIN_VALUE;

        for(int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println(largest);
    }
}
