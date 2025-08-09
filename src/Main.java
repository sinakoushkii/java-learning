import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Game.FillBlanks();
//        operators();
//        shoppingCart();
//        statement();
//        generateRandomNumber();
//        formatOutput();
//        InterestCalculator.calculateInterest();
//        stringConfig();
//        convertWeight();
//        ternaryOperator();
        temperatureConvertor();
    }

    public static void temperatureConvertor() {
        String unit;
        double temp;
        double convertedTemp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();
        System.out.print("convert to Celsius or Fahrenheit (C / F): ");
        unit = scanner.next().toUpperCase();

        convertedTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        scanner.close();

        System.out.printf("\n Converted Temperature: %.2f %s " , convertedTemp , unit.toUpperCase());

    }

    public static void ternaryOperator() {
        int hour = 13;
        int number = 3;
        int score = 75;
        String oddOrEven;
        String passOrFail;
        String timeOfDay;

        timeOfDay = (hour <= 12) ? "A.M" : "P.M";
        passOrFail = (score >= 60) ? "Pass" : "Fail";
        oddOrEven = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Time of day: " + timeOfDay);
        System.out.println("Your score is: " + passOrFail);
        System.out.println("The number is: " + oddOrEven);
    }

    public static void convertWeight() {
        int choise;
        double weight;
        System.out.println("Welcome to the Weight conversion app...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: convert LB to KG ");
        System.out.println("2: convert KG to LB ");
        System.out.print("choose an option: ");
        choise = scanner.nextInt();

        if (choise == 1) {
            System.out.print("Enter your weight (LB): ");
            weight = scanner.nextDouble();
            weight = weight * 0.453592;
            System.out.printf("Your weight is %.2f kg", weight);
        } else if (choise == 2) {
            System.out.print("Enter your weight (KG): ");
            weight = scanner.nextDouble();
            weight = weight * 2.20462;
            System.out.printf("Your weight is %.2f lb", weight);
        } else {
            System.out.println("Selected option doesnt exist !");
        }
        scanner.close();
    }

    public static void stringConfig() {
        String name = "   sina koushki    ";
        String email = "sinakoushki@gmail.com";


        int length = name.length();
        int index = name.indexOf('k');
        int lastIndex = name.lastIndexOf('i');
        char letter = name.charAt(2);

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace('k', 'g');

//        boolean isEqual=name.equals("password");
        boolean isEqual = name.equalsIgnoreCase("password");

        Scanner scanner = new Scanner(System.in);
        String domain = email.substring(5, 15);

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain2 = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain2);

        } else {
            System.out.println("Email is not valid !");
        }

//        System.out.println(isEqual);
        scanner.close();

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
        // printf is used to format output in Java

        int id1 = 7;
        int id2 = 64;
        int id3 = 603;
        int id4 = 7096;

        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);


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