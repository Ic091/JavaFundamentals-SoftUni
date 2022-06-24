package E02DataTypesAndVariables;

import java.util.Scanner;

public class P09DUNEletTheSpiceFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yields = Integer.parseInt(scanner.nextLine());
        int harvest = 0;
        int counter = 0;
        while (yields >99) {
            harvest += yields - 26;
            yields -= 10;
            counter++;

        }
        if (yields < 99&&yields>=26) {
            harvest -= 26;
        }

        System.out.println(counter);
        System.out.println(harvest);
    }
}
