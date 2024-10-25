package ExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder sb = new StringBuilder(encryptedMessage);
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String command = input.split("\\|")[0];


            switch (command) {
                case "Move":
                    int countLetters = Integer.parseInt(input.split("\\|")[1]);
                    String substring = sb.substring(0,countLetters);
                    sb.delete(0,countLetters);
                    sb.append(substring);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split("\\|")[1]);
                    String value = input.split("\\|")[2];
                    sb.insert(index,value);
                    break;
                case "ChangeAll":
                    String substringg = input.split("\\|")[1];
                    String replacement = input.split("\\|")[2];
                    String currentMessage = sb.toString();
                    String newMessage = currentMessage.replace(substringg,replacement);
                    sb = new StringBuilder(newMessage);
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + sb);
    }
}
