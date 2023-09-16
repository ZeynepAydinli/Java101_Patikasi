import java.util.Scanner;
public class TaximeterCalculation {
    public static void main(String[] args) {
        int km, startPrice=10, minTotal=20;
        double total, unitPrice=2.20;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance in km: ");
        km = input.nextInt();

        total = (km * unitPrice) + startPrice;

        total = (total<minTotal)? minTotal : total;

        System.out.print("Total amount: " + total);


    }
}
