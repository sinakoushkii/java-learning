import ir.car.Car;
import ir.person.Teacher;

public class Main{
    public static void main(String[] args){
        Car myCar=new Car("BMW Z4","Black",2025,"German Turbo","super charger");
        Teacher myTeacher=new Teacher("Ali Reza",37,"PHD",50_000);
        System.out.println("-----------------------------");
        myTeacher.rest();
        myTeacher.teach("Math");
        System.out.println(myTeacher.getSalary());
        System.out.println(myTeacher.getEducationDegree());

        System.out.println("-----------------------------");

//        myCar.switchOn();
//        myCar.drive();
//        myCar.ShowEngineInformation();
//
//        System.out.println(myCar.toString());
//        System.out.println("-----------------------------");
    }
}