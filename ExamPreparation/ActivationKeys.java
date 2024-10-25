package ExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String input = scanner.nextLine();
        while(!input.equals("Generate")){
            String[] commandParts = input.split(">>>");
            String command = commandParts[0];
            switch (command){
                //"Contains>>>{substring}":
                //o If the raw activation key contains the given substring, prints: "{raw activation key} contains {substring}".
                //o Otherwise, prints: "Substring not found!"
                case "Contains":
                    String substring = commandParts[1];
                    if(activationKey.contains(substring)){
                        System.out.printf("%s contains %s%n",activationKey,substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                //· "Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                //o Changes the substring between the given indices
                // (the end index is exclusive) to upper or lower case and then prints the activation key.
                //o All given indexes will be valid.
                case "Flip":
                    String letterCase = commandParts[1];
                    int startIndex = Integer.parseInt(commandParts[2]);
                    int endIndex = Integer.parseInt(commandParts[3]);
                    StringBuilder letterCaseSB = new StringBuilder(letterCase);
                    if (letterCase.equals("Upper")){
                        
                    }
                    break;
                case "Slice":
                    break;
            }


                //
                //· "Slice>>>{startIndex}>>>{endIndex}":
                //
                //o Deletes the characters between the start and end indices (the end index is exclusive) and prints the activation key.
                //
                //o Both indices will be valid.


            input = scanner.nextLine();
        }
    }
}
