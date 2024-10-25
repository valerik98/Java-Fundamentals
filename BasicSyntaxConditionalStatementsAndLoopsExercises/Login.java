package BasicSyntaxConditionalStatementsAndLoopsExercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        String test = "";
        for (int i = username.length()-1; i >=0 ; i--) {
            //trebwa da zemim ot 0leva do posledna poziciq simvolite i da gi dolepim naobratno za da poluchim pass
            test = username.charAt(i)+"";
            password +=test;
        }
        String pass = scanner.nextLine();
        int count=1;
        while (!pass.equals(password)){
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
            count++;
            if (count==4){
                System.out.printf("User %s blocked!",username);
                return;
            }
        }
        System.out.printf("User %s logged in.",username);
    }
}
