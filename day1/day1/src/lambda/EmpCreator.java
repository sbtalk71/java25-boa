package lambda;
@FunctionalInterface
public interface EmpCreator {

    Employee create(int id, String name);
}
