package backendschool.week5.day1018;

import java.util.Scanner;

public class SquareStar {

    String letter = "*";

    public void printSquareMatrix(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRectangle2(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printParallelogram(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareStar squareStar = new SquareStar();

//        System.out.print("정사각형 x: ");
//        int num = sc.nextInt();
//        squareStar.printSquareMatrix(num);
//
//        System.out.print("직사각형 x: ");
//        int x = sc.nextInt();
//        System.out.print("직사각형 y: ");
//        int y = sc.nextInt();
//        squareStar.printRectangle(x, y);

        System.out.print("N : ");
        int n = sc.nextInt();
        squareStar.printParallelogram(n);
    }
}
