package OopsConcepts.classesdemo.inheritance;

public class Car extends  Vehicle{
    private int doors;


    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;

    }


    public void displayCarInfo() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }

    public void increaseSpeed(int value){
        int currentSpeed = getSpeed();
        int newSpeed = currentSpeed + value;
        setSpeed(newSpeed);
        if (newSpeed < 0) {
            setSpeed(0);
        } else {
            setSpeed(newSpeed);
        }
        System.out.println("Updated Speed: " + getSpeed() + "hr");

        System.out.println("updated Speed: " + getSpeed() + "hr");
    }

}

