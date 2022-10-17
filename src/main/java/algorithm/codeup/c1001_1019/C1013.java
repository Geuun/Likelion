package algorithm.codeup.c1001_1019;

import java.util.Scanner;

public class C1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력을 Scanner 로 받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 입력 값 출력 후 Scanner 닫기
        System.out.printf("%d %d", a, b);
        sc.close();
    }
}
