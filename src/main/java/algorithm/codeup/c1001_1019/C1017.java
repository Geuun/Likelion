package algorithm.codeup.c1001_1019;

import java.util.Scanner;

public class C1017 {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //사용자 입력 받기
        int x = sc.nextInt();

        //출력 후 Scanner 종료
        System.out.printf("%d %d %d", x, x, x);
        sc.close();
    }
}
