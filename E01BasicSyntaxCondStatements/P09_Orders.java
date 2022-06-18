package L01BasicSyntaxCondStatementsExercise;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int orders = Integer.parseInt(scanner.nextLine());
         double totalPrice = 0;
        for (int i = orders; i>=1 ; i--) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsuls = Integer.parseInt(scanner.nextLine());
            double coffeePrice = price*(countCapsuls*days);
            System.out.printf("The price for the coffee is: $%.2f%n" , coffeePrice);
            totalPrice+=coffeePrice;

        }


        System.out.printf("Total: $%.2f",totalPrice);



    }
}
