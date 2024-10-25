package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int countShots = 0;

        while (!input.equals("End")) {

            int indexOfShot = Integer.parseInt(input);

            if (indexOfShot >= 0 && indexOfShot <= targets.size() - 1 && targets.get(indexOfShot) != -1) {
                int currentTarget = targets.get(indexOfShot);
                targets.set(indexOfShot, -1);
                countShots++;
                for (int position = 0; position < targets.size(); position++) {
                    if (targets.get(position) != -1) {
                        if (targets.get(position) > currentTarget) {
                            int number = targets.get(position)-currentTarget;
                            targets.set(position, number);
                        } else if (targets.get(position) <= currentTarget) {
                            int number = targets.get(position)+currentTarget;
                            targets.set(position, number);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShots);
        for (Integer target : targets) {
            System.out.print(target + " ");
        }
    }
}
