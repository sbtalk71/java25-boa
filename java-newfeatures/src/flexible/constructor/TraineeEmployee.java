package flexible.constructor;

public class TraineeEmployee extends Employee{

private String performance;
    public TraineeEmployee(int id, String name, String performance) {
        super(id, name);
        this.performance=performance;
    }

    @Override
    public void printProfile() {
        super.printProfile();
        System.out.println(performance);
    }
}
