public class ReverseString {

    public static void main(String[] args) {
        String word = "Hello, World!";

        char[] chars = word.toCharArray();
        char[] teste = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            teste[i] = chars[chars.length - i - 1];
        }

        System.out.println(teste);
    }
}


//!dlroW ,olleH