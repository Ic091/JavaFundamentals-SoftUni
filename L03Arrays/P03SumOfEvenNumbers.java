package L03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumbers = scanner.nextLine()    ;
        int numbers[] = Arrays
                .stream(inputNumbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];

            }
        }
        System.out.println(sum);
    }
}
