package String;

public class StringPractice {
    public static void main(String[] args) {

       String s = "Hello";

        System.out.println("String ke total length ha: " + s.length());

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            System.out.println("index " + i + "par character ha " + ch);
        }


    }
}
