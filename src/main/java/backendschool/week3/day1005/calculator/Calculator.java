package main.java.backendschool.week3.day1005.calculator;

/**
 * NumberMaker 에서 만들어준 숫자를 가지고
 * 사칙연산한 결과를 출력한다
 */

public class Calculator {

    private NumberCreator numberCreator;
    private int bassNum;

    public Calculator(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
    }

    public Calculator(NumberCreator numberCreator, int bassNum) {
        this.numberCreator = numberCreator;
        this.bassNum = bassNum;
    }

    public void plus(int num) {
        System.out.println(num + this.numberCreator.create(10));
    }
}