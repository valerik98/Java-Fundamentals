package ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine());
        List<String> products = new ArrayList<>();
        int start = 1;

        for (int i = 1 ; i <=n ; i++) {
            String input = scanner.nextLine();
            products.add(input);
        }
        Collections.sort(products);
        for (String i : products) {
            System.out.println(start + "." + i);
            start++;
        }

    }
}
