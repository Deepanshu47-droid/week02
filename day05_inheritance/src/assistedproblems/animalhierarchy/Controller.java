package assistedproblems.animalhierarchy;

import java.util.Scanner;
public class Controller {
    public static void main(String[] args) {
        //creating Scanner class object
        Scanner input = new Scanner(System.in);

        //taking user input for animal
        System.out.print("Enter animal's name : ");
        String name = input.nextLine();
        System.out.print("Enter animal's age : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter animal's sound : ");
        String sound = input.nextLine();

        //creating Animal class object
        Animal animal = new Animal(name, age);

        //printing details of animal
        System.out.println("\nDetails of animal .....");
        animal.display();
        //calling makeSound() method
        animal.makeSound(sound);

        //taking user input for dog
        System.out.print("\nEnter dog's name : ");
        name = input.nextLine();

        System.out.print("Enter dog's age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter dog's sound : ");
        sound = input.nextLine();

        //creating Dog class object
        Dog dog = new Dog(name, age);

        //printing details of dog
        System.out.println("\nDetails of Dog .....");
        dog.display();
        //calling makeSound() method
        dog.makeSound(sound);

        //taking user input for Cat
        System.out.print("\nEnter Cat's name : ");
        name = input.nextLine();
        System.out.print("Enter Cat's age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Cat's sound : ");
        sound = input.nextLine();

        //creating Cat class object
        Cat cat = new Cat(name, age);

        //printing details of Cat
        System.out.println("\nDetails of Cat .....");
        cat.display();
        //calling makeSound() method
        cat.makeSound(sound);

        //taking user input for bird
        System.out.print("\nEnter bird's name : ");
        name = input.nextLine();
        System.out.print("Enter bird's age : ");
        age = input.nextInt();
        input.nextLine();
        System.out.print("Enter bird's sound : ");
        sound = input.nextLine();

        //creating bird class object
        Bird bird = new Bird(name, age);

        //printing details of bird
        System.out.println("\nDetails of bird .....");
        bird.display();
        //calling makeSound() method
        bird.makeSound(sound);

        //closing input object
        input.close();
    }

}
