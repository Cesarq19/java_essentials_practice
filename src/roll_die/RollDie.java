package roll_die;

import java.util.Random;

public class RollDie
{
    public static void main(String[] args)
    {

        // Presents the game
        System.out.println("Welcome to the Roll Die Game!!");

        int rolls = 4;
        int position = 0;
        int maxSpaces = 20;

        for (int i=0;i<=rolls;i++)
        {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            position += die;
            if (position>maxSpaces)
            {
                System.out.println("Roll #" + (i+1) + ": You've a rolled a " + die + ". You lose!");
                break;
            }
            else if (position == maxSpaces)
            {
                System.out.println("Roll #" + (i+1) + ": You've a rolled a " + die + ". You are now on space "+ position +". Congrats, you win!");
            }
            else if (position < maxSpaces && i<4)
            {
                System.out.println("Roll #" + (i+1) + ": You've a rolled a " + die + ". You are now on space "+ position + " and have " + (maxSpaces-position) + " more to go.");
            }
            else
            {
                System.out.println("Roll #" + (i+1) + ": You've a rolled a " + die + ". You lose!");
            }
        }

    }
}
