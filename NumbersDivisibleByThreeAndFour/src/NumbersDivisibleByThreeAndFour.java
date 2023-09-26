import java.util.Scanner;
public class NumbersDivisibleByThreeAndFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number, count, sum, average;

        System.out.print("Please enter number: ");
        number = input.nextInt();

        count = 0;
        sum = 0;

        for (int i=1; i<=number; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                count = count + 1;
            }
        }
        average = (sum/count);
        System.out.println("Average of numbers divisible by three and four: " + average);
}   }
