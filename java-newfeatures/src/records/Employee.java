package records;

public record Employee(int empId,String name,String city,double salary) {
/*
    public Employee(int empId,String name,String city,double salary) {
        if(empId<100){
            throw new IllegalArgumentException("Id cannot be less than 100");
        }
        this.empId=empId;
        this.name=name;
        this.city=city;
        this.salary=salary;
    }*/

    public Employee{
        if(empId<100){
            throw new IllegalArgumentException("Id cannot be less than 100");
        }
    }
    public Employee(int empId, String name){
        this(empId,name,"Not Known",0.0);
    }

    public String name(){
        return "Name : "+this.name;
    }

}
