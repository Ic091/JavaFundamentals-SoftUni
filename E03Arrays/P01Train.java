package E03Arrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];
        for (int i = 0; i < n; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[i] = countPeople;
        }
int sum = 0;
        for (int element : wagons) {
            System.out.print(element + " ");
             sum+=element;
        }
        System.out.println();
        System.out.println(sum);
    }
}
