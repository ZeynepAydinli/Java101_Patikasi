import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2;
        String select;

        System.out.print("Please enter the first number: ");
        n1 = input.nextDouble();

        System.out.print("Please enter the second number: ");
        n2 = input.nextDouble();

        System.out.println("Addition \nSubtraction \nMultiplication \nDivision");
        System.out.print("Please select the mathematical operation: ");
        input.nextLine();
        select = input.nextLine();

        switch (select) {
            case "Addition":
                System.out.println("Addition result: " + (n1+n2));
                break;
            case "Subtraction":
                System.out.println("Subtraction result: " + (n1-n2));
                break;
            case "Multiplication":
                System.out.println("Multiplication result: " + (n1*n2));
                break;
            case "Division":
                System.out.println((n2 == 0)? "This number is not divisible 0" : "Division Result: " + (n1/n2));
                break;
            default:
                System.out.println("Your made selection invalid!");


        }



    }
}
