package algorithm.codeup.c1020_1040;

import java.util.Scanner;

public class C1027 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.replace('.', '-');

        String list[] = str.split("-");

        System.out.print(list[2] + "-" + list[1] + "-" + list[0]);
    }
}
