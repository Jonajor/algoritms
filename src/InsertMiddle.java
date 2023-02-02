import java.util.Arrays;

public class InsertMiddle {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 11, 33, 45, 2};
        int val = 3;

        var pos = (numbers.length) / 2;

        int[] numbers2 = Arrays.copyOf(numbers, numbers.length + 1);

        for (int i = numbers2.length - 1; i > pos; i--) {
            numbers2[i] = numbers2[i - 1];
        }

        numbers2[pos] = val;

        System.out.println(Arrays.toString(numbers2)); //[2, 5, 11, 3, 33, 45, 2]
    }
}
