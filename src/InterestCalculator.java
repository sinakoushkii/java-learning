import java.util.Scanner;

public class InterestCalculator {
    public static void calculateInterest() {
        int years;
        int timeCompounded;
        double principal;
        double rate;
        double amount;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in %): ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the number of times compounded per year: ");
        timeCompounded = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate / timeCompounded), timeCompounded * years);
        System.out.printf("The whole amount is %.2f",amount);;

        scanner.close();
    }

}
