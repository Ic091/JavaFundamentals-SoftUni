package E02DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int waterCapacity = 255;
        int totalLiters = 0;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());


            if (waterCapacity < liters) {


                System.out.println("Insufficient capacity!");
                continue;
            }
            waterCapacity -= liters;
            totalLiters += liters;

        }

        System.out.println(totalLiters);


    }
}
