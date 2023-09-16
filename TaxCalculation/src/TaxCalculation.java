import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args) {

        double amount, amountTo1000=1.18, amountOver1000=1.08;
        Scanner input = new Scanner(System.in);

        System.out.print("PLease Enter Your Amount: ");
        amount = input.nextDouble();
        System.out.println(amount>=0 && amount<=1000 ? "Tax Amount: %18" : "Tax Amount: %8");

        amountTo1000*=amount;
        amountOver1000*=amount;
        System.out.print("Your Taxed Amount: ");
        System.out.println(amount<=1000? amountTo1000:amountOver1000);

    }
}
