package E03Arrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstElement = input.split(" ")[0];
            String secondElement = input.split(" ")[1];
            if ((i + 1) % 2 == 1) {
                firstArray[i] = firstElement;
                secondArray[i] = secondElement;
            } else {
                firstArray[i] = secondElement;
                secondArray[i] = firstElement;
            }


        }
        for (String element : firstArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (String element : secondArray) {
            System.out.print(element + " ");
        }

    }
}
