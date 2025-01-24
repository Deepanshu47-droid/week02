package hybridinheritance.reataurantmanagement;

public class Waiter extends Person implements Worker {
    //constructor to initialize values
    public Waiter(String name, String id) {
        super(name, id);
    }
    //implementation of performDuties() method
    @Override
    public void performDuties() {
        System.out.println("Serves dishes..");
    }
}
