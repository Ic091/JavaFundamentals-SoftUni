package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P11KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();


        int bestSequence = 0;
        int maxLength = 0;
        int startIndex=0;
        while (!command.equals("Clone them!")) {
            int[] array = Arrays.stream(command.split("!+")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int length = 1;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];

            }


            command = scanner.nextLine();
        }


    }
}
