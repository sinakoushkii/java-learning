import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Game.FillBlanks();
        operators();
    }

    public static void learning() {
        int age = 37;
        double userPoint = 17.36;
        char symbol = '%';
        String currency = "dollar";

        double width = 0;
        double height = 0;
        double area = 0;

        Information.ShowInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is equal to : " + area);

        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();


        System.out.println("hello " + name + " your are " + userAge + " years old");
        System.out.println("your gpa is: " + gpa);
        scanner.close();

    }

    public static void operators() {
        int x = 10;
        int y = 2;
        int z;

//        z = x*y;
//        z = x % y;
//        z = x + y;
//        x+=y;
//        x-=y;
//        x *= y;
        x /= y;

        System.out.println(x);
    }

}