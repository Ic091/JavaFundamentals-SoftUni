package E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P12Ladybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[]bugsField=new int[size];
        int[] bugsPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.next();
        for (int ladyBugsIndex :bugsPositions) {
            bugsField[ladyBugsIndex]=1;
        }
        while (!input.equals("end")) {
           String[]tokens = input.split(" ");
int index = Integer.parseInt(tokens[0]);
String direction =
            input = scanner.nextLine();
        }
    }
}
