package test_results;

import java.util.Scanner;

public class TestResults
{
    public static void main(String[] args) {

        // Get the test score
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade;
        if (score < 60)
        {
            grade = 'F';
        }
        else if (score < 70)
        {
            grade = 'D';
        }
        else if (score < 80)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }

        //Output
        System.out.println("Your score is " + score + " and your grade is " + grade);
    }
}
