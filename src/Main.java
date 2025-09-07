import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Car myCar = new Car("BMW", "X5", 60000);

        myCar.setName("Mercedes");
        myCar.setPrice(75000);

        System.out.println(myCar.getName() + " " + myCar.getModel() + " " + myCar.getPrice());

        Animal[] allAnimal = {new Dog(), new Cat()};

        for (Animal animal : allAnimal) {
            animal.makeSound();
        }

        Animal animal;
        System.out.print("choose an animal (1-Dog 2-Cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.makeSound();
        } else if (choice == 2) {
            animal = new Cat();
            animal.makeSound();
        }
    }

//    test
    static void rockPaperScissors() {
        String userMove;
        String[] Options = {"rock", "paper", "scissors"};
        Random randomNumber = new Random();

        System.out.print("Enter your move: ");
        userMove = scanner.nextLine();


        //declare variables
        //get the choise from user
        //get random choise from the computer
        //check win condition
        //ask to play again
    }

    static void quizGame() {
        char userAnswers[] = new char[4];
        char keys[] = {'A', 'B', 'C', 'D'};


        String[] questions = {
                "1-Which country has the largest population in the world (as of 2025)?",
                "2-What is the chemical symbol for gold?",
                "3-Who was the first President of the United States?",
                "4-How many players are there on a standard soccer team (on the field)?",
        };
        String[][] options = {
                {"A)India", "B)China", "C)United States", "D)Indonesia"},
                {"A)Ag", "B)Au", "C)Gd", "D)Go"},
                {"A)Thomas Jefferson", "B)Abraham Lincoln", "C)George Washington", "D)John Adams"},
                {"A)9", "B)10", "C)11", "D)12"},
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("=========================================");
            System.out.print("Enter the charachter: ");
            char userInput = scanner.nextLine().toUpperCase().charAt(0);
            if (userInput != 'A' && userInput != 'B' && userInput != 'C' && userInput != 'D') {
                System.out.println("The option is not valid");
                break;
            } else {
                userAnswers[i] = userInput;
            }
//            userAnswers[i]=
        }

        System.out.println("*******************************************");

        for (int i = 0; i < keys.length; i++) {
            if (userAnswers[i] == keys[i]) {
                System.out.printf("The answer {%c} Is Correct for the question {%d}", userAnswers[i], i + 1);
                System.out.println();
            } else {
                System.out.printf("The answer {%c} IS Wrong for the question {%d} -> ", userAnswers[i], i + 1);
                System.out.printf("The correct answer Is: {%c} \n", keys[i]);
            }
        }
    }

    static void print2dArray() {

        String[][] groceries = {
                {"chicken", "meat", "fish"},
                {"orange", "apple", "watermelon"},
                {"potato", "onion", "carrot"}
        };

//        first index is for the row and the second index is for the column
        groceries[1][0] = "banana";
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }

    static void printSumOfVarargs(int... numbers) {
//        varargs= allow a method to accept varying number of arguments,
//        there is no need to use overloaded methods, java will pack the arguments in an array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of Entered numbers is: " + sum);
    }

    static void searchInArray() {
        String[] fruits = {"banana", "apple", "watermelon"};
        int[] numbers = {2, 9, 3, 7, 1, 10, 6, 4, 8};
        String searchedFruit;
        int searchedNumber;
        boolean isFoundFruit = false;
        boolean isFoundNumber = false;

        System.out.print("Enter the name of a fruits: ");
        searchedFruit = scanner.nextLine();

        System.out.print("Enter a number: ");
        searchedNumber = scanner.nextInt();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(searchedFruit)) {
                System.out.println("Element found at the index of " + i);
                isFoundFruit = true;
                break;
            }
        }
        if (!isFoundFruit) {
            System.out.println("There is no such fruits !");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchedNumber) {
                System.out.println("Number found at the index of " + i);
                isFoundNumber = true;
                break;
            }
        }
        if (!isFoundNumber) {
            System.out.println("There is no such number !");
        }
    }

    static void foodOrder() {
        String[] foods;
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number of food do you want: ");
        size = scanner.nextInt();
        foods = new String[size];

        scanner.nextLine();

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter the food name: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.print(food + " ");
        }

        scanner.close();
    }

    static void sampleArray() {
        String names[] = {"sina", "omid", "reza", "amir", "soheil"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("r")) {
                System.out.print(names[i] + " ");
            }

        }
        System.out.println("");
        Arrays.sort(names);
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    static void diceRoller() {
        int numberOfDice;
        int total = 0;

        Random randomNumber = new Random();
        System.out.print("Enter The number of dice :");
        numberOfDice = scanner.nextInt();

        for (int i = 1; i <= numberOfDice; i++) {
            int generatedRandomNumber = 0;
            generatedRandomNumber = randomNumber.nextInt(1, 7);
            printDice(generatedRandomNumber);
            total += generatedRandomNumber;
        }

    }

    static void printDice(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                |●      |
                |       |
                |      ●|
                 -------
                """;
        String dice3 = """
                 -------
                |●      |
                |   ●   |
                |      ●|
                 -------
                """;
        String dice4 = """
                 -------
                |●     ●|
                |       |
                |●     ●|
                 -------
                """;
        String dice5 = """
                 -------
                |●     ●|
                |   ●   |
                |●     ●|
                 -------
                """;
        String dice6 = """
                 -------
                |●  ●  ●|
                |       |
                |●  ●  ●|
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }

    public static void bankSystem() {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("********************");
            System.out.println("Banking System");
            System.out.println("********************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter a number (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid item was selected !");
            }
        }

        System.out.println("==============================");
        System.out.println("Thank you ! have a nice day .");
        System.out.println("==============================");
        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.printf("Your account balance is: $%.2f\n", balance);
    }

    static double deposit() {
        double amount;

        System.out.print("Enter The amount: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("You are not allowed to enter negative numbers !!!");
            return 0;
        } else {
            System.out.println("Successful Deposit...");
            return amount;
        }

    }

    static double withdraw(double balance) {
        double amount;

        System.out.print("Enter The amount to withdraw: ");
        amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient funds !");
            return 0;
        } else if (amount < 0) {
            System.out.println("You are not allowed to enter negative numbers !!!");
            return 0;
        } else {
            System.out.println("Successful Withdraw...");
            return amount;
        }

    }

    public static void calculator() {
        double numebrA;
        double numberB;
        double result = 0;
        String operator;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        numebrA = scanner.nextDouble();
        System.out.print("Enter Number 2: ");
        numberB = scanner.nextDouble();

        System.out.print("Choose the operation (* / + - ^) : ");
        scanner.nextLine();
        operator = scanner.nextLine();
        scanner.close();


        switch (operator) {
            case "+" -> result = numebrA + numberB;
            case "-" -> result = (numebrA > numberB) ? numebrA - numberB : numberB - numebrA;
            case "*" -> result = numebrA * numberB;
            case "/" -> result = (numebrA > numberB) ? numebrA / numberB : numberB / numebrA;
            case "^" -> result = Math.pow(numebrA, numberB);
            default -> System.out.println("Entered operator is not accepted !");
        }

        System.out.printf("The result is : %.1f ", result);

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

//        Information.ShowInfo();
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