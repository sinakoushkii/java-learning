import java.util.ArrayList;
import java.util.Scanner;

public class Restorunt {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList();

        Scanner scanner =new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("Welcome To The Iranian Restaurant");
        System.out.println("*********************************");

        System.out.print("How many food do you want?");
        int numberOfFood = scanner.nextInt();


        for  (int i = 1; i <= numberOfFood; i++) {
            System.out.print("what food do you want?: ");
            String food = scanner.next();
            foods.add(food);
        }
        scanner.close();

        System.out.print("your foods are: ");
        System.out.println(foods);

    }
}
