import java.util.Scanner;
public class ClassPassingStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float math, physical, turkish, chemistry, music, average;

        System.out.print("Please enter your math result: ");
        math = input.nextFloat();
        math = (math>=0 && math<=100)? math : 0;

        System.out.print("Please enter your physical result: ");
        physical = input.nextFloat();
        physical = (physical>=0 && physical<=100)? physical : 0;

        System.out.print("Please enter your turkish result: ");
        turkish = input.nextFloat();
        turkish = (turkish>=0 && turkish<=100)? turkish : 0;

        System.out.print("Please enter your chemistry result: ");
        chemistry = input.nextFloat();
        chemistry = (chemistry>=0 && chemistry<=100)? chemistry : 0;

        System.out.print("Please enter your music result: ");
        music = input.nextFloat();
        music = (music>=0 && music<=100)? music : 0;

        average = (math + physical + turkish + chemistry + music)/5;
        System.out.println("Your average: " + average);

        if (average >= 55) {
            System.out.println("Congratulations, you passed the class.");

        }else {
            System.out.println("You failed the class, try again.");
        }
    }
}
