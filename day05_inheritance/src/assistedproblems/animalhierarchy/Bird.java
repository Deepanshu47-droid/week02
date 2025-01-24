package assistedproblems.animalhierarchy;

public class Bird extends Animal {

    //constructor to initialize values
    public Bird(String name, int age) {
        super(name, age);
    }
    //overriding makeSound() method
    @Override
    public void makeSound(String sound) {
        System.out.println("bird Sound..." + sound);
    }
}
