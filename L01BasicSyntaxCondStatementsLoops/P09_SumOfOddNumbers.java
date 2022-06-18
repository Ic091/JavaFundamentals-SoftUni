package L01BasicSyntaxCondStatementsLoops;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

int sum = 0;
int firstNum = 1;
        for (int i = 1; i <=n ; i++) {

            System.out.println(firstNum);
            sum+=firstNum;
firstNum+=2;

        }
        System.out.printf("Sum: %d", sum    );

    }
}
