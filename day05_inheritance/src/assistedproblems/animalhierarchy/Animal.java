package assistedproblems.animalhierarchy;

public class Animal {

    //fields
    public String name;
    public int age;

    //constructor to initialize values
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to make sound
    public void makeSound(String sound) {
        System.out.println("Animal sound...." + sound);
    }
    //method to display details
    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}
