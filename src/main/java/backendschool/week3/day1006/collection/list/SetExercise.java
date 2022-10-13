package main.java.backendschool.week3.day1006.collection.list;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // tree set

        set1.add("김재근");
        set1.add("김재근");
        set1.add("김나나");

        System.out.println(set1);

        Set<Integer> setInteger = new HashSet<>();

        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(setInteger);

    }
}
