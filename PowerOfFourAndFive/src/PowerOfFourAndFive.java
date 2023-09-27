import java.util.Scanner;
public class PowerOfFourAndFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.print("Please enter the limit number: ");
        num = scan.nextInt();

        System.out.println("Power of four: ");
        for (int i=1; i<=num; i*=4) {
            System.out.println(i);
        }
        System.out.println("Power of five: ");
        for (int i=1; i<=num; i*=5) {
            System.out.println(i);
        }
    }
}
