import java.util.Scanner;
public class TheSumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num, evensum, sum4;

        evensum = 0;
        sum4 = 0;

        do {
            System.out.print("Please enter number: ");
            num = scan.nextFloat();
            if (num % 2 == 0) {
                evensum += num;
            }
            if (num % 4 == 0) {
                sum4 += num;
            }

        } while (num % 2 == 0);

        System.out.println("The sum of even numbers: " + evensum);
        System.out.println("The sum of numbers divisible by four: " + sum4);
    }
}
