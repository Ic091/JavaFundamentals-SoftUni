package L02DataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToString  {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         char firstSymbol = scanner.nextLine().charAt(0);
         char secondSymbol = scanner.nextLine().charAt(0);
         char thirdSymbol = scanner.nextLine().charAt(0);

         String text = String.valueOf(firstSymbol)+String.valueOf(secondSymbol)+String.valueOf(thirdSymbol);
        System.out.println(text);
    }
}
