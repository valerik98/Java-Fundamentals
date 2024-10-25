package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String command = input.split(" ")[0];

            if (command.equals("merge")) {
                int start = Integer.parseInt(input.split(" ")[1]);
                int end = Integer.parseInt(input.split(" ")[2]);

                if (start < 0) {
                    start = 0;
                }
                if (end > list.size() - 1) {
                    end = list.size() - 1;
                }
                if (start >= 0 && start <= list.size() - 1 && end >= 0 && end <= list.size() - 1){
                    String result = "";
                    for (int i = start; i <= end; i++) {
                    String current = list.get(i);
                    result += current;
                    }
                    for (int i = start; i <= end; i++) {
                        list.remove(start);
                    }
                    list.add(start,result);
                }



//Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl
            } else if (command.equals("divide")) {
                int index = Integer.parseInt(input.split(" ")[1]);
                int partitions = Integer.parseInt(input.split(" ")[2]);

                String currentElement = list.get(index);
                int currentElementLength = currentElement.length();//6
                int countSymbols = currentElementLength/partitions;// dva simvola        na tri mesta


            }

            input = scanner.nextLine();
        }
    }
}
