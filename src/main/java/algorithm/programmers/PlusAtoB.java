package algorithm.programmers;

public class PlusAtoB {
    public long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i<= b; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        } else answer = a;
        return answer;
    }

    public static void main(String[] args) {
        PlusAtoB plusAtoB = new PlusAtoB();

        System.out.println(plusAtoB.solution(3, 5));
        System.out.println(plusAtoB.solution(3, 3));
        System.out.println(plusAtoB.solution(5, 3));

    }
}
