package algorithm.programmers;

import java.util.Scanner;

public class SuBak {
    public String solution(int num) {
        String answer = "";

        for(int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SuBak suBak = new SuBak();
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 길이 num : ");
        int num = sc.nextInt();

        String answer = suBak.solution(num);

        System.out.println(answer);

    }
}

/**
 * 프로그래머스 수박수박수 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */