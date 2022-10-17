package algorithm.codeup.c1001_1019;

import java.util.Scanner;

public class C1015 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        float x = sc.nextFloat();

        // 출력 후 Scanner 닫기
        System.out.printf("%.2f", x);
        sc.close();
    }
}
