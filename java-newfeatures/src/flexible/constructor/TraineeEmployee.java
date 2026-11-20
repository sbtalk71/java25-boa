package flexible.constructor;

public class TraineeEmployee extends Employee{

private String performance;
    public TraineeEmployee(int id, String name, String performance) {
        if(id<100){
            throw new IllegalArgumentException("Id cannot be less than 100");
        }

        super(id, name);
        this.performance=performance;
    }

    @Override
    public void printProfile() {
        super.printProfile();
        System.out.println(performance);
    }
}
