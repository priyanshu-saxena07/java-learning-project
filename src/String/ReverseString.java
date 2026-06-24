package String;

public class ReverseString {

    public static  String reverseString(String str) {

        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return new String(ch);

    }

    public static void main(String[] args) {

        String input = "Priyanshu";

        String result = reverseString(input);


        System.out.println("Reversed: " + result);


    }
}
