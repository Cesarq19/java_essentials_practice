package instant_credit_check;

import java.util.Scanner;

public class InstantCreditCheck
{
    public static void main(String[] args) {

        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        // Check if a user is qualified
        boolean qualified = isUserQualified(creditScore,salary);
        notifyUser(qualified);

    }

    public static boolean isUserQualified(int creditScore, double salary)
    {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (creditScore >= requiredCreditScore && salary >= requiredSalary)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void notifyUser(boolean isQualified)
    {
        if(isQualified)
        {
            System.out.println("Congrats! You've been approved!");
        }
        else
        {
            System.out.println("Sorry, you've been declined.");
        }
    }
}
