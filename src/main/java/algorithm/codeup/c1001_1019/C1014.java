package algorithm.codeup.c1001_1019;

import java.util.Scanner;

public class C1014 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //변수 선언 후 사용자 입력받기
        String x = sc.next();
        String y = sc.next();

        // 출력 후 Scanner 닫기
        System.out.printf("%s %s", y, x);
        sc.close();
    }
}
