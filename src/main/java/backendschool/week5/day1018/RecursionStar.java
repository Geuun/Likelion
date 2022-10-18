package backendschool.week5.day1018;

import java.util.Scanner;

public class RecursionStar {
    public void baseCase(int n) {
        if(n <= 0) {
            return;
        }
        baseCase(n - 1);
        System.out.print("*");
    }

    public void recursiveCase(int n) {
        if(n <= 0) {
            return;
        }
        recursiveCase(n - 1);
        baseCase(n);
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RecursionStar recursionStar = new RecursionStar();
        int n = sc.nextInt();

        recursionStar.recursiveCase(n);
    }
}
