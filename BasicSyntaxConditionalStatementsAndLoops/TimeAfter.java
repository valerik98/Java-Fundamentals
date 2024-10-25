package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TimeAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int hours = Integer.parseInt (scanner.nextLine());
        int minutes = Integer.parseInt (scanner.nextLine());

        //1 46
        int totalMinutes = minutes +60*hours+30;
        int totalHours = totalMinutes/60;
        int totalMinutesTwo = totalMinutes%60;
        if (totalHours>=24){
            totalHours = 0;
        }

        System.out.printf("%d:%02d",totalHours,totalMinutesTwo);
    }
}
