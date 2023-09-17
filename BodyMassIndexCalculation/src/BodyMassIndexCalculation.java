import java.util.Scanner;
public class BodyMassIndexCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double m, kg, result;

        System.out.print("Please enter your height as a meter form with using comma:  ");
        m = input.nextDouble();

        System.out.print("Please enter your weight:  ");
        kg = input.nextDouble();

        result = (kg / (m*m));

        System.out.print("This is your body mass index: ");
        System.out.println(result);

    }
}
