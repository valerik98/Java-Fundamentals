package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt (scanner.nextLine());
        PrintTriangle(number);
    }
    public static void PrintTriangle(int number){
        for (int i = 1; i <= number ; i++) {
            PrintLine(1,i);
        }
        for (int i = number; i >=1 ; i--) {
            PrintLine(1,i);
        }
    }
    public static void PrintLine (int start, int end){
        for (int i = start; i <=end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
