package main.java.codeup.c1020_1040;

import java.util.Scanner;

public class C1025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        char[] arr = num.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i]);
            for (int j = arr.length-1; j > i; j--) {
                System.out.print("0");
            }
            System.out.print("]\n");
        }
    }
}