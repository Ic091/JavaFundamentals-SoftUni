package L02DataTypesAndVariables;

import java.util.Scanner;

public class P02PoundsToUSDollarsConverter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double punds = Double.parseDouble(scanner.nextLine());


         double usDollars = punds*1.36;
        System.out.printf("%.3f ",usDollars);





    }
}
