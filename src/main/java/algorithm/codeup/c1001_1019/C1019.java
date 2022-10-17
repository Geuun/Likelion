package algorithm.codeup.c1001_1019;

import java.util.Scanner;

public class C1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine();

        String[] dateArr = date.split("\\.");

        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
        sc.close();
    }
}
