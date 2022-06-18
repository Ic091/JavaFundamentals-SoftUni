package L01BasicSyntaxCondStatementsExercise;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumOfCoins = 0;
        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);
            if (currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5 || currentCoin == 1 || currentCoin == 2) {
                sumOfCoins += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            }


            input = scanner.nextLine();
        }
//Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            switch (command) {
                case "Nuts":
                    if (sumOfCoins < 2.0) {
                        System.out.println("Sorry, not enough money");

                        break;
                    }
                    sumOfCoins -= 2;
                    System.out.println("Purchased Nuts");
                    break;
                case "Water":
                    if (sumOfCoins < 0.7) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sumOfCoins -= 0.7;
                    System.out.println("Purchased Water");
                    break;
                case "Crisps":
                    if (sumOfCoins < 1.5) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sumOfCoins -= 1.5;
                    System.out.println("Purchased Crisps");
                    break;
                case "Soda":
                    if (sumOfCoins < 0.8) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sumOfCoins -= 0.8;
                    System.out.println("Purchased Soda");
                    break;
                case "Coke":
                    if (sumOfCoins < 1) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    sumOfCoins -= 1;
                    System.out.println("Purchased Coke");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumOfCoins);

    }
}
