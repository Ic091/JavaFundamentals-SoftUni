package E03Arrays;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String oldElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];

            }
            array[array.length - 1] = oldElement;


        }
        for (String elements : array) {
            System.out.print(elements + " ");
        }

    }
}
