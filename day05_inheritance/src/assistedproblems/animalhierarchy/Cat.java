package assistedproblems.animalhierarchy;

public class Cat extends Animal {

    //constructor to initialize values
    public Cat(String name, int age) {
        super(name, age);
    }

    //overriding makeSound() method
    @Override
    public void makeSound(String sound) {
        System.out.println("Cat Sound..." + sound);
    }
}
