package algorithm.programmers;

import algorithm.datastructure.hash.Hash;

import java.util.Arrays;
import java.util.HashMap;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);


        int i;
        for (i = 0; i < completion.length; i++)
            if (participant[i] != completion[i])
                break;


        return participant[i];
    }

    public static void main(String[] args) {
        UnfinishedPlayer unfinishedPlayer = new UnfinishedPlayer();

        String[] partici = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(unfinishedPlayer.solution(partici, comp));
    }
}

/**
 * 문제 단순화
 * N명의 이름 / N-1 명의 완주자
 * 두 배열을 비교해서 빠진 한명을 출력
 */