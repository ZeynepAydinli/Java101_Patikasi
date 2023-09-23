import java.util.Scanner;
public class FindingHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.print("Please enter only the month of your birth date: ");
        month = input.nextInt();
        if (month > 0 && month <= 12) {
            System.out.print("Please enter only the day of your birth date: ");
            day = input.nextInt();

            if (month == 1) {
                if (0 < day && day < 22) {
                    System.out.println("Your Horoscope is Capricorn");
                } else if (21 < day && day <= 31) {
                    System.out.println("Your Horoscope is Aquarius");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 2) {
                if (0 < day && day < 20) {
                    System.out.println("Your Horoscope is Aquarius");
                } else if (19 < day && day <= 28) {
                    System.out.println("Your Horoscope is Pisces");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 3) {
                if (0 < day && day < 21) {
                    System.out.println("Your Horoscope is Pisces");
                } else if (20 < day && day <= 31) {
                    System.out.println("Your Horoscope is Aries");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 4) {
                if (0 < day && day < 21) {
                    System.out.println("Your Horoscope is Aries");
                } else if (20 < day && day <= 30) {
                    System.out.println("Your Horoscope is Taurus");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }


            if (month == 5) {
                if (0 < day && day < 22) {
                    System.out.println("Your Horoscope is Taurus");
                } else if (21 < day && day <= 31) {
                    System.out.println("Your Horoscope is Gemini");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 6) {
                if (0 < day && day < 23) {
                    System.out.println("Your Horoscope is Gemini");
                } else if (22 < day && day <= 30) {
                    System.out.println("Your Horoscope is Cancer");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 7) {
                if (0 < day && day < 23) {
                    System.out.println("Your Horoscope is Cancer");
                } else if (22 < day && day <= 31) {
                    System.out.println("Your Horoscope is Leo");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 8) {
                if (0 < day && day < 24) {
                    System.out.println("Your Horoscope is Leo");
                } else if (23 < day && day <= 31) {
                    System.out.println("Your Horoscope is Virgo");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 9) {
                if (0 < day && day < 23) {
                    System.out.println("Your Horoscope is Virgo");
                } else if (22 < day && day <= 30) {
                    System.out.println("Your Horoscope is Libra");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 10) {
                if (0 < day && day < 23) {
                    System.out.println("Your Horoscope is Libra");
                } else if (22 < day && day <= 31) {
                    System.out.println("Your Horoscope is Scorpio");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 11) {
                if (0 < day && day < 22) {
                    System.out.println("Your Horoscope is Scorpio");
                } else if (21 < day && day <= 30) {
                    System.out.println("Your Horoscope is Sagittarius");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

            if (month == 12) {
                if (0 < day && day < 22) {
                    System.out.println("Your Horoscope is Sagittarius");
                } else if (21 < day && day <= 31) {
                    System.out.println("Your Horoscope is Capricorn");
                } else {
                    System.out.println("You entered the wrong day!");
                }
            }

        } else {
            System.out.println("You entered the wrong month!");
        }
    }
}










