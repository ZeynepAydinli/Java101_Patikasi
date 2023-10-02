import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, add;

        System.out.print("Please enter number: ");
        n = scan.nextInt();

        if (n<=0) {
            System.out.println("You entered wrong");
        }else {

        add = 0;
        for(int i=1; i<n; i++) {
            if(n % i == 0) {
                add += i;
            }
        }
        if(add == n) {
            System.out.println(n + " is the perfect number :)");
        }else {
            System.out.println(n + " is not the perfect number :(");
        }}
    }
}
