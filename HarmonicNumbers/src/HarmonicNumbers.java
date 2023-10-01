import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double result=0;


        System.out.print("Please enter number: ");
        n = scan.nextInt();

        for (double i=1; i<=n; i++) {
            result += (1/i);
        }
        System.out.println("Result the harmonic number: " + result);
    }
}
