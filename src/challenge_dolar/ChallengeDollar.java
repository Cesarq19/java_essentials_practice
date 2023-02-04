package challenge_dolar;

import java.util.Scanner;

public class ChallengeDollar
{
    public static void main(String[] args) {

        int nickels = 0;
        int pennies = 0;
        int dimes = 0;
        int quarters = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to \'Change for a dollar\' Your goal is to enter enough change to make exactly $1.00");
        System.out.println("Enter your number of pennies:");
        pennies = scanner.nextInt();
        System.out.println("Enter your number of nickles:");
        nickels = scanner.nextInt();
        System.out.println("Enter your number of dimes:");
        dimes = scanner.nextInt();
        System.out.println("Enter your number of quarters:");
        quarters = scanner.nextInt();
        scanner.close();

        double total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters *0.25;
        double over = 0;
        String message;

        if (total > 1.00)
        {
            over = total - 1.00;
            message = "You lose! Estas por encima de $1 por " + String.format("%.2f",over);
        }
        else if (total < 1.00)
        {
            over = 1.00 - total;
            message = "You lose! Estas por debajo de $1 por " + String.format("%.2f",over);
        }
        else
        {
            message = "Yay! That's exactly $1.00! You win!";
        }

        // Output
        System.out.println(message);

    }
}
