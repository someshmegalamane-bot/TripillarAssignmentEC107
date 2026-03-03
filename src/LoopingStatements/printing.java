package LoopingStatements;

import java.util.Scanner;

public class printing {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * i; k <= 2 * size; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 2 * i + 1; k <= 2 * size - 1; k++) {
                System.out.print("");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
//        }
        }
    }
}