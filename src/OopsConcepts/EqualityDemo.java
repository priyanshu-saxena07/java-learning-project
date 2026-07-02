package OopsConcepts;


public class EqualityDemo {
    public static void main(String[] args) {

        String a = "Java";

        String b = new String("Java");
        String c = b.intern();


        System.out.println("Using == (a == b): " + (a == b));
        System.out.println("Using == (a == c): " + (a == c));


        System.out.println("Using equals (a.equals(b)): " + a.equals(b));
        System.out.println("Using equals (a.equals(c)): " + a.equals(c));


    }
}


