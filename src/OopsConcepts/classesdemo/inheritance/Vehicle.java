package OopsConcepts.classesdemo.inheritance;

public class Vehicle {
     private String brand;
     private int speed;


    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("brand: " + brand + ", speed: " + speed + "hm/hr");
    }


}
