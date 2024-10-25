package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt (scanner.nextLine());


        for (int position = 0; position <numbers.length ; position++) {
            int sum = 0;
            for (int newPosition = position+1; newPosition < numbers.length; newPosition++) {
                sum = numbers[position]+numbers[newPosition];
                if (sum==magicNumber){
                    System.out.printf("%d %d\n",numbers[position],numbers[newPosition]);
                }
            }
        }
    }
}
