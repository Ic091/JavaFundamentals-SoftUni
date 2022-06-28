package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopInteger {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int[] array    = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         boolean isBigger = false;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (i==array.length-1){
                System.out.print(array[i]);
                break;


                }
            for (int j = i+1; j < array.length; j++) {
                int nextNumber = array[j];
              if (currentNumber>nextNumber){
                 isBigger=true;

              }else {
                  isBigger=false;
                  break;
              }

            }
            if (isBigger){
                System.out.print(currentNumber+" ");
            }
        }
    }
}
