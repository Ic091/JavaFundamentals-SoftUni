package L03Arrays;

import java.util.Scanner;

public class P05EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
            int[]numbersArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbersArr[i]=Integer.parseInt(arr[i]);

        }
        int evenSum = 0;
        int oddSum = 0;
        for (int element : numbersArr) {
            if (element%2==0){
                evenSum+=element;
            }else{
                oddSum+=element;
            }
        }
        int diff = evenSum-oddSum;
        System.out.println(diff);
    }
}
