import java.util.*;
import java.util.stream.Collectors;

public class SortAndRemoveDuplicateNumbers {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 99, 66, 44, 22, 22, 44, 2, 3, 33, 4, 4, 5, 10, 5};

        Set<Integer> newNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            newNumbers.add(numbers[i]);
        }

        List<Integer> integerList = newNumbers.stream().sorted().toList();

        System.out.println(integerList);
    }
}
