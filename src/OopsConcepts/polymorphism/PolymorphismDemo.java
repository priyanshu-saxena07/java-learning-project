package OopsConcepts.polymorphism;



class calculator {
    public int add(int a, int b) {
        return  a + b;
    }

    public  double add(double  a,  double b) {
          return a + b;
    }

}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 250,5);
        c1.displayInfo();


        Bike b1 = new Bike("hero",120,true);
        b1.displayInfo();

       c1.start();
       b1.start();


        //
        Vehicle v1 = new Car("Mahindra", 250,5);
        v1.start();

        
    }
}

