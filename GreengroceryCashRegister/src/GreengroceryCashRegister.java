import java.util.Scanner;
public class GreengroceryCashRegister {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double apple=2.14, banana=0.95, tomato=1.11, pear=2.14, eggplant=5.00;
        double a,b,t,p,e, result;

        System.out.print("Please enter your the amount of apple as a kg form: ");
        a = input.nextDouble();

        System.out.print("Please enter your the amount of banana as a kg form: ");
        b = input.nextDouble();

        System.out.print("Please enter your the amount of tomato as a kg form: ");
        t = input.nextDouble();

        System.out.print("Please enter your the amount of pear as a kg form: ");
        p = input.nextDouble();

        System.out.print("Please enter your the amount of eggplant as a kg form: ");
        e = input.nextDouble();

        result = (a*apple) + (b*banana) + (t*tomato) + (p*pear) + (e*eggplant);

        System.out.println("Your total amount:" + " " + result + "TL");
    }
}
