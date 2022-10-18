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
        // TODO: 고쳐야 됨!!!
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n ; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.println(" ");
                }
                System.out.print("*");
            }
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

        System.out.print("N : >>");
        int n = sc.nextInt();
        squareStar.printRectangle2(n);
    }
}
