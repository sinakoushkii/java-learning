package ir.person;

public class Person {
    protected String name;
    protected int age;
    protected String educationDegree;
    public Person(String name, int age, String educationDegree) {
        this.name = name;
        this.age=age;
        this.educationDegree=educationDegree;
    }

    public String getName() {
        return this.name;
    }

    public String getEducationDegree() {
        return this.educationDegree;
    }

    public void rest(){
        System.out.println(this.name+" is resting .");
    }
    public void study(){
        System.out.println(this.name+" is studying .");
    }
    public void learn(String skill){
        System.out.println(this.name+" is learning "+skill);
    }
}
