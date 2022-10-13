package main.java.backendschool.week3.day1006.randomnumber;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num);
    }
}
