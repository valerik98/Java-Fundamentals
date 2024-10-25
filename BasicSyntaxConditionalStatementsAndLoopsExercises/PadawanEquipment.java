package BasicSyntaxConditionalStatementsAndLoopsExercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        double lightsabers = Math.ceil(countStudents*1.10)*lightsabersPrice;
        double robes = robesPrice*countStudents;
        double belts = beltsPrice*(countStudents-(countStudents/6));
        sum = lightsabers+robes+belts;

        if (budget>=sum){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(sum-budget));
        }
    }
}
