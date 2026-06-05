package ir.person;

public class Teacher extends Person{
    private long salary;
    public Teacher(String name, int age,String educationDegree, long salary) {
        super(name,age,educationDegree);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void teach(String lesson){
        System.out.println(super.getName()+" is teaching "+lesson);
    }

    @Override
    public void rest(){
        System.out.println(super.getName()+" is drinking tea in the resting room");
    }
}
