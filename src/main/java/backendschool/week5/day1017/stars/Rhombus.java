package backendschool.week5.stars;

import java.util.Scanner;

public class Rhombus {

    private String letter = "*";

    public Rhombus() {
    }

    public Rhombus(String letter) {
        this.letter = letter;
    }

    public void printRhombus(int num) {

        for (int i = 0; i < num; i++) {
            //공백출력
            for (int j = num - i - 1; j > 0; j--) {
                System.out.print(" ");
            } //별출력
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }//줄바꿈
            System.out.println();
        }
        // --------------- 여기부터 별 감소
        for (int i = 0; i < num; i++) {
            //공백출력
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            //별출력
            for (int k = (num - i - 1) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }//줄바꿈
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rhombus rhombus = new Rhombus();

        int num = sc.nextInt();
        rhombus.printRhombus(num);
    }
}
