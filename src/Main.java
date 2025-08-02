import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Game.FillBlanks();
//        operators();
//        shoppingCart();
//        statement();
//        generateRandomNumber();
        formatOutput();
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

    public static void shoppingCart() {
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        double total = 0;
        int quantity;
        char currency = '$';

        System.out.println("Welcome to the shopping cart!");
        System.out.print("Enter items to add to your cart: ");
        item = scanner.nextLine();

        System.out.print("Enter the price of " + item + ": ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of " + item + ": ");
        quantity = scanner.nextInt();
        total = price * quantity;
        System.out.println("You have added " + quantity + " " + item + "(s) to your cart.");
        System.out.println("Total cost: " + currency + total);

        scanner.close();
    }

    public static void statement() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("You did not enter your name!");
        } else {
            System.out.println("Hello " + name + "!");
        }
        scanner.close();
    }

    public static void generateRandomNumber() {
        int number1;
        double number2;
        boolean isHeads;

        Random random = new Random();
        number1 = random.nextInt(1, 7);

        // Generate a random double number between 0 and 1
        number2 = random.nextDouble(1, 3);

        // Round the double number to 2 decimal places
        number2 = Math.round(number2 * 100.0) / 100.0;
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(isHeads ? "Heads" : "Tails");
    }

    public static void formatOutput() {

        int id1 = 7;
        int id2 = 64;
        int id3 = 603;
        int id4 = 7096;

        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);


        double price1 = 1900000.99;
        double price2 = 800000.205;
        double price3 = -4500210.63;

        System.out.printf("\n%+,.1f\n", price1);
        System.out.printf("%,+.1f\n", price2);
        System.out.printf("%,+.2f\n", price3);

        String name = "John"; // s is the specifier-character for String
        char firstLetter = 'J'; //c is the specifier-character for char
        int age = 30; // d is the specifier-character for integer
        double height = 6.7; // f is the specifier-character for float/double
        boolean isEmployed = true; // b is the specifier-character for boolean

        System.out.printf("\nHello %s\n", name);
        System.out.printf("your name starts with %c\n", firstLetter);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("you are %.1f inches tall\n", height);
        System.out.printf("are you employed? %b\n", isEmployed);
        System.out.printf("Hello %s, your name starts with %c, you are %d years old, you are %.2f inches tall, and are you employed? %b\n",
                name, firstLetter, age, height, isEmployed);
    }


}