package DSA.Arrays.String;

public class PalindromeCheck {
    public static boolean palindromeCheck(String str) {
        if (str == null) {
            return true;
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            // Agar dono characters match nahi huye
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }



    public static void main(String[] args) {
        String str = "madam";
        boolean result = palindromeCheck(str);

        System.out.println("String: " + str);

        System.out.println("is Palindrome? " + result);
    }
}


