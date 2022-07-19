package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = 1;
        int maxLength = 0;
        int bestSequence = 0;
        int startIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                length++;

            } else {
                startIndex = i;
                length = 1;
            }
            if (length > maxLength) {
                maxLength = length;
                bestSequence = startIndex;
            }
        }
        for (int i = bestSequence; i < bestSequence + maxLength; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
