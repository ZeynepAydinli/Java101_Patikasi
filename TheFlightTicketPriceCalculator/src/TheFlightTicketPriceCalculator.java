import java.util.Scanner;
public class TheFlightTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, totalPrice, pricePerKm = 0.10;
        int age, trip;

        System.out.print("Please enter the distance in km: ");
        km = input.nextDouble();

        if (km>0) {

            System.out.print("Please enter your age: ");
            age = input.nextInt();

            if (age>0) {

                System.out.print("Please enter the trip type (1 => One Way, 2 => Round Trip): ");
                trip = input.nextInt();

                if (trip==1 || trip==2) {

                    totalPrice = (km * pricePerKm);

                    if (age<12) {
                        totalPrice = (totalPrice * 0.5);
                        if (trip == 2){
                            totalPrice = (totalPrice * 0.8) * 2;
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        } else{
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        }

                    }else if (age>=12 && age<=24) {
                        totalPrice = (totalPrice * 0.90);
                        if (trip == 2) {
                            totalPrice = (totalPrice * 0.8) * 2;
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        } else {
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        }

                    }else if (age>25 && age<65) {
                        if (trip == 2) {
                            totalPrice = (totalPrice * 0.8) * 2;
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        } else {
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        }

                    }else if (age>=65) {
                        totalPrice = (totalPrice * 0.70);
                        if (trip == 2) {
                            totalPrice = (totalPrice * 0.8) * 2;
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        } else {
                            System.out.println("Total Amount: " + totalPrice + "TL");
                        }
                    }
                }else {
                    System.out.println("You entered incorrect data");
                }
            }else {
                System.out.println("You entered incorrect data");
            }
        }else {
            System.out.println("You entered incorrect data");
        }
    }
}
