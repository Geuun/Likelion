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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareStar squareStar = new SquareStar();

        System.out.print("정사각형 x: ");
        int num = sc.nextInt();
        squareStar.printSquareMatrix(num);

        System.out.print("직사각형 x: ");
        int x = sc.nextInt();
        System.out.print("직사각형 y: ");
        int y = sc.nextInt();
        squareStar.printRectangle(x, y);

    }
}
