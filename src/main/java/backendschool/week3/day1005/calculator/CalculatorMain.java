package main.java.backendschool.week3.day1005.calculator;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ByPassNumberCreator());
        calculator.plus(10);
    }
}
