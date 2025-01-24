package hybridinheritance.reataurantmanagement;

public class Person {
    //fields
    public String name;
    public String id;

    //constructor to initialize values
    public Person(String name, String id) {
        this.name = name;
        this. id = id;
    }
    //method to display details
    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Id : " + this.id);
    }
}
