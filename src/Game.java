import java.util.Scanner;

public class Game {
    public static void FillBlanks() {
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal / person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();



        System.out.println("\n Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + " !");
        System.out.println("I was " + adjective3 + " !");

        scanner.close();

    }
}
