package E03Arrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
        for (String element :secondArray) {
            for (String currentElement :firstArray) {
                if (element.equals(currentElement)){
                    System.out.print(currentElement+" ");

                }

            }

        }

    }
}
