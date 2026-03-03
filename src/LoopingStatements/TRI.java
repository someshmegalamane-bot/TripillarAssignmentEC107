package LoopingStatements;

import java.util.Scanner;

public class TRI {
    static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        size = sc.nextInt();
        for (int i = 0; i < size ; i ++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
