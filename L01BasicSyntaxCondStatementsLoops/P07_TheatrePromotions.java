package L01BasicSyntaxCondStatementsLoops;

import java.util.Scanner;

public class P07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfTheDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;
        if (age >= 0 && age <= 18) {
            if (typeOfTheDay.equals("Weekday")) {
                ticketPrice = 12;
                System.out.printf("%.0f" + "$", ticketPrice);

            } else if (typeOfTheDay.equals("Weekend")) {
                ticketPrice = 15;
                System.out.printf("%.0f" + "$", ticketPrice);
            } else if (typeOfTheDay.equals("Holiday")) {
                ticketPrice = 5;
                System.out.printf("%.0f" + "$", ticketPrice);
            }
        } else if (age >= 19 && age <= 64) {
            if (typeOfTheDay.equals("Weekday")) {
                ticketPrice = 18;
                System.out.printf("%.0f" + "$", ticketPrice);

            } else if (typeOfTheDay.equals("Weekend")) {
                ticketPrice = 20;
                System.out.printf("%.0f" + "$", ticketPrice);

            } else if (typeOfTheDay.equals("Holiday")) {
                ticketPrice = 12;
                System.out.printf("%.0f" + "$", ticketPrice);
            }

        } else if (age >= 65 && age <= 122) {
            if (typeOfTheDay.equals("Weekday")) {
                ticketPrice = 12;
                System.out.printf("%.0f" + "$", ticketPrice);
            }
            if (typeOfTheDay.equals("Weekend")) {
                ticketPrice = 15;
                System.out.printf("%.0f" + "$", ticketPrice);
            }
            if (typeOfTheDay.equals("Holiday")) {
                ticketPrice = 10;
                System.out.printf("%.0f" + "$", ticketPrice);
            }

        } else {
            System.out.println("Error!");
        }

    }
}
