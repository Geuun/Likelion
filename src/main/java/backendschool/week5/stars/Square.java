package backendschool.week5.stars;

import java.util.Scanner;

public class Square {

    private String letter = "*";

    public void printSquare(int num) {

        for (int i = 1; i <= num-1; i++) {
            // 입력 값 만큼 반복하는 반복문
            for (int j = num - i; j >= 0; j--) {
                // 공백 갯수는 i가 증가하는 만큼 줄어든다.
                System.out.print(" ");
            }
            for (int k = 1; k<= i*2-1; k++) {
                // 별의 갯수는 1, 3, 5, 7, ... 이므로 홀수
                System.out.print(this.letter);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Square square = new Square();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        square.printSquare(num);

    }
}
