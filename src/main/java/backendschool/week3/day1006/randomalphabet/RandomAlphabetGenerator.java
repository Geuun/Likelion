package main.java.backendschool.week3.day1006.randomalphabet;

public class RandomAlphabetGenerator {
    public static void main(String[] args) {

        /**
         * 0~25 까지의 랜덤한 실수를 만든다
         * 위의 랜덤 실수에, 대문자 A의 10진수 아스키 코드 번호 65 를 더한뒤 출력
         */

        System.out.println("랜덤 알파벳을 생성합니다!");
        for (int i = 1; i <= 50; i++) {
            char ch = (char)((Math.random() * 26) + 65);
            System.out.print(ch + " ");
        }
    }
}
