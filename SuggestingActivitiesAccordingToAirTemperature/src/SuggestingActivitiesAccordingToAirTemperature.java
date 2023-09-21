import java.util.Scanner;
public class SuggestingActivitiesAccordingToAirTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temp;

        System.out.print("Please enter the air temperature: ");
        temp = input.nextFloat();

        if (temp<5) {
            System.out.println("You might prefer to ski");

        }else if (temp<10){
            System.out.println("You might prefer to go to the cinema");

        }else if (temp>=10 && temp<=15) {
            System.out.println("You might prefer to go to the cinema or picnic");

        }else if (temp<=25){
            System.out.println("You might prefer to picnic");

        }else{
            System.out.println("You might prefer swimming");
        }
    }
}
