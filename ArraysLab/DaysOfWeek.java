package ArraysLab;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt (scanner.nextLine());
        String[] daysOfWeek = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number>=1 && number <=7){
            System.out.println(daysOfWeek[number-1]);
        }else {
            System.out.println("Invalid day!");
        }


    }

}
