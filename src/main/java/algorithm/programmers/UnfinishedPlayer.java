package algorithm.programmers;

/**
 * 문제 단순화
 * N명의 이름 / N-1 명의 완주자
 * 두 배열을 비교해서 빠진 한명을 출력
 *
 * 1. 반복문
 * 2. 해쉬사용
 *
 * 동명이인 문제는 어떡할껀가...?
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i]))
                break;
        }
        answer = participant[i];
        return answer;
    }

    public String solutionHash(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            // 바로 put을 할 수 없다.
            if(!hash.containsKey(key)) {
                hash.put(key, 0);
            }
            hash.put(key, hash.get(key) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            hash.put(key, hash.get(key) - 1);
        }
        for (String key : hash.keySet()) {
            if (hash.get(key) == 1) {
                return answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        UnfinishedPlayer unfinishedPlayer = new UnfinishedPlayer();

        String[] partici = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp = {"josipa", "filipa", "marina", "nikola"};


        System.out.println("반복문 " + unfinishedPlayer.solution(partici, comp));
        System.out.println("해쉬 " + unfinishedPlayer.solutionHash(partici, comp));
    }
}

