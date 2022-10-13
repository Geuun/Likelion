package main.java.backendschool.week3.day1006.collection.hashmap;

/**
 * Mapping 한거에서
 * git 주소의 알파벳 갯수 출력하기
 * 1. String을 한글자씩 출력할 수 있어야한다. -> charAt
 * 2. String str = "abcdef";
 * 3. boolean isAlphabet(char c) -> c가 알파벳인지 check하는 function
 * 4. Map<String, Integer> map = a~z 까지 등록해놓고 count를 1개 씩 올린다.
 */

import java.util.Map;
import java.util.Scanner;

public class AlphabetCountMain {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print(">>> ");
                String toCount = sc.nextLine();
                AlphabetCount test = new AlphabetCount(toCount);

                test.count();

                Map<Character, Integer> testMap = test.getAlphabetMap();

                for (Map.Entry<Character, Integer> characterIntegerEntry : testMap.entrySet()) {
                        System.out.println("문자 " + characterIntegerEntry.getKey() + "은(는) " + characterIntegerEntry.getValue() + "개 있습니다.");
                }
        }
}
