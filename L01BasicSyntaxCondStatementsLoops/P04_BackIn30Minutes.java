package L01BasicSyntaxCondStatementsLoops;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         int hours = Integer.parseInt(scanner.nextLine());
         int minutes = Integer.parseInt(scanner.nextLine());

         int timeIn30Min = hours*60 + minutes +30;
         int hoursAfter30Min = timeIn30Min/60;
         int minutesAfter30Min = timeIn30Min%60;
            if (hoursAfter30Min>23){
                hoursAfter30Min=0;
            }
        System.out.printf("%d:%02d",hoursAfter30Min , minutesAfter30Min);

    }
}
