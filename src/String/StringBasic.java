package String;

public class StringBasic {
    public static void main(String[] args) {

        String s = " hello";
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >=  0; i--) {
            char ch = s.charAt(i);


            sb.append(ch);
        }
        System.out.println("Reversed String " + sb);


    }
}
