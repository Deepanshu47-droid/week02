package hybridinheritance.reataurantmanagement;

public class Chef extends Person implements Worker {
    //fields
    public String speciality;

    //constructor to initialize values
    public Chef(String name, String id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }
    //implementation of performDuties() method
    @Override
    public void performDuties() {
        System.out.println("Prepares delicious " + this.speciality);
    }
}
