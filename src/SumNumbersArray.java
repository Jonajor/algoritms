public class SumNumbersArray {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 11, 45, 2};

        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        System.out.println(sum);
    }
}
