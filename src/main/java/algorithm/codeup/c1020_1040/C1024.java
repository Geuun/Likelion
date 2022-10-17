package algorithm.codeup.c1020_1040;

import java.util.Scanner;

public class C1024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");

        for (int i = 0; i < str.length; i++) {
            System.out.printf("'%s'\n", str[i]);
        }
    }
}
