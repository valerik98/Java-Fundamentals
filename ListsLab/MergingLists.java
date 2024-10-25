package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List <Integer> firstNumbers = Arrays
                                            .stream(scanner.nextLine().split(" "))
                                            .map(Integer::parseInt)
                                            .collect(Collectors.toList());
        List <Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                                                 .map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> newList = new ArrayList<>();

        int minSize = Math.min(firstNumbers.size(),secondNumbers.size());
        for (int i = 0; i < minSize; i++) {
            newList.add(firstNumbers.get(i));
            newList.add(secondNumbers.get(i));
        }
        if (firstNumbers.size()>secondNumbers.size()){
            // subList(a,b) - създава лист от а до b;
            // аddAll - добавя всички стойности от листа;
            List <Integer> subList = firstNumbers.subList(minSize,firstNumbers.size());
            newList.addAll(subList);

        } else if (firstNumbers.size()<secondNumbers.size()) {
            List <Integer> subList = secondNumbers.subList(minSize,secondNumbers.size());
            newList.addAll(subList);
        }
        for (Integer i : newList) {
            System.out.print(i+" ");
        }

    }
}
