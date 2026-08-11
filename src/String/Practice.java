package String;

public class Practice {
    @SuppressWarnings({"StringOperationCanBeDestroyed", "StringEquality"})
    public static void main(String[] args) {
        String a = "hello";   // stored in pool
        String b = "hello";   // reuses same pool reference
        String c = new String("hello");  // creates a new object on the heap

        System.out.println(a == b);  // true  (same pool reference)
        System.out.println(a == c);  // false (different object)

    }
}
