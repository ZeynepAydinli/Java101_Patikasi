import java.util.Scanner;
public class GradePointAverageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,physics,chemistry,turkish,history,music;

        System.out.print("Please enter your mathematics note: ");
        mat = input.nextInt();

        System.out.print("Please enter your physics note: ");
        physics = input.nextInt();

        System.out.print("Please enter your chemistry note: ");
        chemistry = input.nextInt();

        System.out.print("Please enter your turkish note: ");
        turkish = input.nextInt();

        System.out.print("Please enter your history note: ");
        history = input.nextInt();

        System.out.print("Please enter your music note: ");
        music = input.nextInt();

        double average = (double) ((mat+physics+chemistry+turkish+history+music)/6);
        System.out.println("Your average: " + average );

        System.out.println( average>=60? "You passed the lesson" : "You failed the lesson");

    }
}
