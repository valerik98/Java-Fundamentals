package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "U\\$([A-Z][a-z]{2,})U\\$P@\\$([a-z]{5,}[0-9]{1,})P@\\$";
        Pattern pattern = Pattern.compile(regex);

        int successfulRegistrationsCount = 0;

        for (int i = 0; i <n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()){
                String username = matcher.group(1);
                String password = matcher.group(2);
                System.out.println("Registration was successful");
                System.out.println("Username: " + username + ", Password: " + password);
                successfulRegistrationsCount++;
            }else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + successfulRegistrationsCount);

    }
}
