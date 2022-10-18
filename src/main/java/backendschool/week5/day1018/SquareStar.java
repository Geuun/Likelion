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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareStar squareStar = new SquareStar();
        int num = sc.nextInt();

        squareStar.printSquareMatrix(num);
    }
}
