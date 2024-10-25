package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int position = 0; position <=firstArray.length-1 ; position++) {
            if (firstArray[position]!=secondArray[position]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",position);
                return;
            }
            sum +=firstArray[position];
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
