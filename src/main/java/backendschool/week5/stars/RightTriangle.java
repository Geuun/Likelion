package backendschool.week5.stars;

import java.util.Scanner;

public class RightTriangle {
    private String str = "*";

    public RightTriangle() {
    }

    public RightTriangle(String str) {
        this.str = str;
    }

    public void printStar(int num) {
        /**
         * *
         * **
         * ***
         * ****
         */

        for (int i = 0; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(this.str);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        RightTriangle rightTriangle = new RightTriangle();
        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        rightTriangle.printStar(lines);
    }
}
