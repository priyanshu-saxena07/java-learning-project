package OopsConcepts.classesdemo.encapsulation;

class Car {
     private String brand;
     private String color;
      private int speed;


    public Car(String b, String c, int s) {
        brand = b;
        color = c;
        speed = s;
        setSpeed(speed);
    }

    public void drive () {
        System.out.println(brand + " is driving at " + speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0)
             speed = 0;
        this.speed = speed;
    }
}


public class EncapsulationDemo {
    public static void main(String[] args)   {
        Car car1 = new Car("Toyota", "blue", 100);
//        car1.setSpeed(-200);
         car1.drive();



        Car car2 = new Car("kisa", "black", 150);
        car2.setSpeed(200);
        car2.drive();

    }
}
