package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String product = scanner.nextLine();
        int countProduct = Integer.parseInt (scanner.nextLine());
        CalculateOrder(product,countProduct);
    }
    public static void CalculateOrder(String product, int countProduct){
        switch (product){
            case "coffee":
                System.out.printf("%.2f",countProduct*1.50);
                break;
            case"water":
                System.out.printf("%.2f",countProduct*1.00);
                break;
            case "coke":
                System.out.printf("%.2f",countProduct*1.40);
                break;
            case "snacks":
                System.out.printf("%.2f",countProduct*2.00);
                break;
        }
    }
}
