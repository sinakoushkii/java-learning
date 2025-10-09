import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            System.out.println(65/0);
        }
        catch (InputMismatchException e){
            System.out.println("You entered a String not a NUMBER");
        }
        catch (ArithmeticException e){
            System.out.println("you cannot devide by ZERO !");
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
        finally {
            scanner.close();
        }
    }
}
