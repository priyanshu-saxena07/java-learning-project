package LearnString;

public class StringBasices {
    public static void main(String[] args) {
        String name = "Anuj";
        String samename = "Anuj";
        String  newname = new String("Anuj");

        System.out.println(name + newname);

//        if(name == samename) {
//            System.out.println("both are same");
//        }
//        if(name ==  newname) {
//            System.out.println("both are same");
//        } else {
//            System.out.println("both are not same");
//        }
        if(name.equals(newname)) {
            System.out.println("name and newName have same value");
        } else {
            System.out.println("naot same");
        }

    }
}
