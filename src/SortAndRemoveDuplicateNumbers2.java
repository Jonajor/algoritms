import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortAndRemoveDuplicateNumbers2 {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 99, 66, 44, 22, 22, 44, 2, 3, 33, 4, 4, 5, 10, 5};

        Arrays.sort(numbers);
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] != numbers[i - 1]){
                    numbers[count++] = numbers[i];
                }
        }

        int[] numbers2 = Arrays.copyOfRange(numbers, 0, count);

        System.out.println(Arrays.toString(numbers2));
    }
}
