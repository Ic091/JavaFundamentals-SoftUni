package L01BasicSyntaxCondStatementsLoops;

import java.util.Scanner;

public class P11_MultiplicationTable2_0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multiplicator = Integer.parseInt(scanner.nextLine());


        int sum = 0;
        if (multiplicator <= 10) {
            for (int i = multiplicator; i <= 10; i++) {
                sum = num * i;
                System.out.printf("%d X %d = %d%n", num, i, sum);
            }
        } else {
            sum = num * multiplicator;
            System.out.printf("%d X %d = %d", num, multiplicator, sum);
        }


    }
}
