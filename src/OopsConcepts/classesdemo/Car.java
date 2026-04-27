package OopsConcepts.classesdemo;

     public class Car {
         String brand;
        String color;
         private int speed;

         public Car(String b, String c, int s) {
             brand = b;
             color = c;
             speed = s;
            setSpeed(speed);

         }

         public void drive(){
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

