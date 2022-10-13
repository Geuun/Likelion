package main.java.backendschool.week4.day1011;

public class ProgrammersPlus {
    public int solution1(int n) {
        int answer = 0;

        // n을 스트링으로 변경
        String str = Integer.toString(n);

        // string을 loop을 돌면서 parseInt 후 더한다.
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i + 1));
        }
        return answer;
    }

    public int solution2(int n) {
        // % 연산 이용 몫, 나머지
        int result = 0;
/*
        // i = 0
        System.out.println(n / 10); // 1234 / 10 몫 123
        System.out.println(n % 10); // 나머지 4

        // i = 1
        System.out.println(n / 10); // 123 / 10 몫 12
        System.out.println(n % 10); // 나머지 3
*/
        //for문으로는 안되고 while문을 쓴다.
        //나머지를 먼저 구해야 한다.
        while (n > 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        // 687 = 6 + 8 + 7 = 21

        ProgrammersPlus pPlus = new ProgrammersPlus();
        int result = pPlus.solution2(1234);

        if (result == 10) {
            System.out.println("테스트를 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result:%d \n", result);
        }
    }
}
