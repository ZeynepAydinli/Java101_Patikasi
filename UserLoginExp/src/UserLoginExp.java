import java.util.Scanner;
public class UserLoginExp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, reset, newPW, newPW2;

        System.out.print("Please enter your username: ");
        userName = input.nextLine();

        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.println("Login");
        }else if (userName.equals("Pati") && password.equals("java123")) {
            System.out.println("User name is not correct!!! Please enter again!");
        }else if (userName.equals("Patika") && password.equals("java")) {
            System.out.println("Password is not correct!!!");
            System.out.print("Do you want to reset the password? ");
            reset = input.nextLine();
            if (reset.equals("Yes")) {
                System.out.print("Please enter your new password: ");
                newPW = input.nextLine();
                if (newPW.equals("java123") || newPW.equals("java")) {
                    System.out.print("Could not create password! Please enter another password: ");
                    newPW2 = input.nextLine();
                    System.out.println("Password created");
                } else {
                    System.out.println("Password created");
                }
            } else if (reset.equals("No")) {
                System.out.println("Please enter again your password");
            }
        }else {
            System.out.println("You have logged in incorrectly, please again!");
        }

    }
}
