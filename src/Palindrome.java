public class Palindrome {

    public static void main(String[] args) {
        String word = "racecar";

        char[] chars = word.toCharArray();
        char[] teste = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            teste[i] = chars[chars.length - i - 1];
        }

        String palindrome = String.copyValueOf(teste);
        if (word.equals(palindrome)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }
}
