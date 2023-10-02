import java.util.Scanner;
public class FindingMinAndMaxValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, numbers, min=0, max=0;

        System.out.print("How many numbers will you enter? ");
        n = scan.nextInt();

        if(n<0){
            System.out.println("You entered wrong");
        }else {
            for (int i=1; i<=n; i++) {
            System.out.print("Enter the " + i + ". number: ");
            numbers = scan.nextInt();

            if (i==1) {
                max=numbers;
                min=numbers;
            }
            if(numbers<min) {
                min = numbers;
            }
            if(numbers>max) {
                max = numbers;
            }}
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
