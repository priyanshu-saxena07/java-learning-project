package OopsConcepts.polymorphism;





public class PolymorphismDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", -250,5);
        c1.start();


        Bike b1 = new Bike("hero",120,true);
        b1.start();




        //
        Vehicle v1 = new Car("Mahindra", 250,5);
        v1.start();

        
    }
}

