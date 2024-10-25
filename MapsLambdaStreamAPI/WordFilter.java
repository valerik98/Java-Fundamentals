package MapsLambdaStreamAPI;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Read an array of strings, and take only words whose length is even. Print each word on a new line.

        String[] words = Arrays.stream(scanner.nextLine().split(" ")).filter(word -> word.length()%2==0).toArray(String[]::new);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
