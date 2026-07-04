package String;

public class StringBasic {
    public static void main(String[] args) {
        //  Reverse a String without Built-in API
        String str = "Noida";
        String reverse = "";

        for (int i = str.length()- 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);



    }
}
