package main.java.backendschool.week3.day1006.collection.hashmap;


import java.util.HashMap;
import java.util.Map;

public class AlphabetCount {

    /**
     * 65 ~ 90 대문자
     * 97 ~ 122  소문자
     */

    private String str;

    private Map<Character, Integer> alphabetMap;

    public AlphabetCount(String str) {
        this.str = str;
        this.alphabetMap = new HashMap<>();
    }

    public boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public void count() {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isAlphabet(c)) {
                if ((int) c >= 97)
                    c = Character.toUpperCase(c);
                if (alphabetMap.get(c) != null)
                    alphabetMap.put(c, alphabetMap.get(c) + 1);
                else alphabetMap.put(c, 1);
            }
        }
    }

    public Map<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }
}
