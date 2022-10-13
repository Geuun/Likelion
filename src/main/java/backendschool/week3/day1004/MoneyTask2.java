package main.java.backendschool.week3.day1004;

import java.util.Scanner;

public class MoneyTask2 {
    public static void main(String[] args) {

        /**
         * 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
         */

        int[] currencyType = new int[]{50000, 10000, 5000, 1000, 500, 100};

        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요 :");
        int refund = sc.nextInt();

        for (int i = 0; i < currencyType.length; i++) {
            /**
             * 나머지 연산
             * 각 화폐 단위로 나누었을 때의 몫과 나머지를 구하는 문제
             * 나머지를 변수에 누적
             */

            System.out.println(refund / currencyType[i]);
        }
    }
}
