package E01BasicSyntaxCondStatements;

import java.util.Scanner;

public class P08_PrintTriangle {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            for (int j =i; j >=1; j--) {

                System.out.print(i+" ");


            }
            System.out.println();
        }



    }
}
