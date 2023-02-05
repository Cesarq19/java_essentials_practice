package password_validator;

import java.util.Scanner;

public class PasswordValidator
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        User user = new User("johndoe","ABC_1234");
        verifyPassword(user);
    }

    public static void verifyPassword(User user)
    {
        String currentPassword = user.getPassword();
        String username = user.getUsername();

        System.out.println("Enter a new password:");
        String newPassword = scanner.next();


        if (newPassword.length() < 8)
        {
            System.out.println("The password must be at least eight characters long");
        }
        else if (!isUppercase(newPassword))
        {
            System.out.println("The password must be contains an uppercase letter");
        } else if (!containsSpecialCharacter(newPassword))
        {
            System.out.println("The password must be contains a special character");
        } else if (newPassword.contains(username))
        {
            System.out.println("The password must not contains the username");
        } else if (newPassword.equals(currentPassword))
        {
            System.out.println("The new password must not be equals to the old password");

        }
        else
        {
            System.out.println("The new password is verified.");
        }
    }

    public static boolean isUppercase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z')
            {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return true;
            }
        }
        return false;
    }
}
