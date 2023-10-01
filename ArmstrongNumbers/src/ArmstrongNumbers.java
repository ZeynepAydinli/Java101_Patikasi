import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n, tempN, count = 0;

        System.out.print("Please enter number: ");
        n = scan.nextInt();

        tempN = n;

        while (tempN != 0) {
            tempN /= 10;
            count++;
        }
        int valueN, multN, result=0;

        tempN = n;
        while (tempN != 0) {
            valueN = tempN % 10;
            tempN /= 10;
            multN = 1;
            for (int i = 1; i <= count; i++) {
                multN *= valueN;
            }
            result += multN;
        }
        if (result == n) {
            System.out.println(n + " number is an Armstrong number");
        } else {
            System.out.println(n + " number is not an Armstrong number");
        }
    }
}

