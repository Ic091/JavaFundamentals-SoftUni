package L01BasicSyntaxCondStatementsExercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double priceForOneDay = 0;

        switch (day) {
            case "Friday":
                switch (typePeople) {
                    case "Students":
                        priceForOneDay = 8.45;
                        break;
                    case "Business":
                        priceForOneDay = 10.90;
                        break;
                    case "Regular":
                        priceForOneDay = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (typePeople) {
                    case "Students":
                        priceForOneDay = 9.80;
                        break;
                    case "Business":
                        priceForOneDay = 15.60;
                        break;
                    case "Regular":
                        priceForOneDay = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (typePeople) {
                    case "Students":
                        priceForOneDay = 10.46;
                        break;
                    case "Business":
                        priceForOneDay = 16;
                        break;
                    case "Regular":
                        priceForOneDay = 22.50;
                        break;
                }
                break;


        }
        double totalPrice = 0;
        totalPrice = priceForOneDay * countPeople;
        if (typePeople.equals("Students") && countPeople >= 30) {
            totalPrice *= 0.85;
        } else if (typePeople.equals("Business") && countPeople >= 100){
            totalPrice=totalPrice- 10*priceForOneDay;

        }else if (typePeople.equals("Regular")&& countPeople>=10&&countPeople<=20){
            totalPrice*=0.95;
        }
        System.out.printf(  "Total price: %.2f",totalPrice);
    }
}
