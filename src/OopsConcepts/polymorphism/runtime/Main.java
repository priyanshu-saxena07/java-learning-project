package OopsConcepts.polymorphism.runtime;

// 1. Separate Parent Class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

// 2. Separate Child Class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof Woo");
    }
}

// 3. Separate Child Class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

// 4. Clean Main Class
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();

        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
