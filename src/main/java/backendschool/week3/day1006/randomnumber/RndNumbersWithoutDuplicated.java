package main.java.backendschool.week3.day1006.randomnumber;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        Set<Integer> randomNumberSet = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            System.out.println(r);
            randomNumberSet.add(r);
        }

        System.out.println(randomNumberSet);
    }
}
