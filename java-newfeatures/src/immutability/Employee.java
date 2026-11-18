package immutability;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<String> skills;

    public Employee(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = List.copyOf(skills);
    }

    public void profileInfo(){
        System.out.println(id+" "+name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+skills;
    }
}
