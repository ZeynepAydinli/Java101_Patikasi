import java.util.Scanner;
public class SimpleATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password;
        int right=3, balance=1500, select, withdrawMoney, depositMoney;

        while (right > 0) {
            System.out.print("Please enter your username: ");
            username = scan.nextLine();
            System.out.print("Please enter your password: ");
            password = scan.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("You have successfully logged in");

                do {
                    System.out.println("Transactions: \n 1) To deposit money\n 2) Withdraw money\n 3) Balance inquiry\n 4) Exit ");
                    System.out.print("Please select the transaction you want to take: ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Your balance: " + balance);
                            System.out.print("Enter the amount you want to deposit: ");
                            depositMoney = scan.nextInt();
                            balance = balance + depositMoney;
                            System.out.println("Your new balance: " + balance);
                            break;
                        case 2:
                            System.out.println("Your balance: " + balance);
                            System.out.print("Enter the amount you want to withdraw: ");
                            withdrawMoney = scan.nextInt();
                            if (balance > withdrawMoney) {
                                balance = balance - withdrawMoney;
                                System.out.println("You can withdraw your money");
                                System.out.println("Your new balance: " + balance);
                            } else {
                                System.out.println("Your balance is insufficient");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            System.out.println("You are logged out");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("You have logged in incorrectly");
                if (right == 0) {
                    System.out.println("Your card has been blocked.\nContact your bank");
                }else {
                    System.out.println("Your remaining right: " + right);
                }
            }
        }
    }
}

