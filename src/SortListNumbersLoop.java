import java.util.Arrays;
import java.util.LinkedList;

public class SortListNumbersLoop {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 44, 4, 45, 5, 7, 8, 10, 9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
