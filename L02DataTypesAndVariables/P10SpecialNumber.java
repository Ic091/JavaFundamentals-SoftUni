package L02DataTypesAndVariables;

import java.util.Scanner;

public class P10SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int number = i;
            while (number > 0) {
                int lastDigit = number % 10;
                number = number / 10;
                sum += lastDigit;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }


    }
}
