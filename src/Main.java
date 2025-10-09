import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Car myCar=new Car("mostung","black","V8");
        myCar.displayCarInformation();
        System.out.println("===============");
        myCar.carStarts();
    }
}
