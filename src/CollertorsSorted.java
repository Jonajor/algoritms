import java.util.Arrays;
import java.util.List;

public class CollertorsSorted {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 66, 7, 33, 4, 7899, 22, 0};
        List<Integer> list = Arrays.stream(numbers).sorted().boxed().toList();
        System.out.println(list);
    }
}