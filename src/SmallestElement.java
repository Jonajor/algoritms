import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestElement {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 11, 45, 2, 1, 3};

        int smallest = Integer.MAX_VALUE;

        for(int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println(smallest);
    }
}
