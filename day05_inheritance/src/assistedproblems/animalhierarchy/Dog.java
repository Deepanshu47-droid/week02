package assistedproblems.animalhierarchy;

public class Dog extends Animal {

    //constructor to initialize values
    public Dog(String name, int age) {
        super(name, age);
    }

    //overriding makeSound() method
    @Override
    public void makeSound(String sound) {
        System.out.println("Dog Sound..." + sound);
    }
}
