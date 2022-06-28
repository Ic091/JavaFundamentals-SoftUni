package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//1 1 "3" 3
        boolean isFound = false;
        for (int index =0; index < array.length; index++) {
            int currentElement = array[index];
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i <index; i++) {
                leftSum += array[i];


            }
            for (int i = index + 1; i < array.length; i++) {
                rightSum += array[i];

            }
            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }
    }

}

