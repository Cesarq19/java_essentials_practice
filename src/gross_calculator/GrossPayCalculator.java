package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator
{
    public static void main(String[] args) {
        // 1. Get the number of hours worked
        String season;
        int number;
        String adjective;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the season of the year?");
        season = scanner.next();
        System.out.println("Type a whole number");
        number = scanner.nextInt();
        System.out.println("Type an adjective for the text");
        adjective = scanner.next();
        scanner.close();

        String texto = "On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.";
        // 4. Display result
        System.out.println(texto);
    }
}
