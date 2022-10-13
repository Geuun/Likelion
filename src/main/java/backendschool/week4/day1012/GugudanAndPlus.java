package main.java.backendschool.week4.day1012;

interface Operation {
    int operation(int a, int b);
}

public class GugudanAndPlus {
    public void printGugudanTemplate(int dan, String operator, Operation operation) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d %s %d = %d\n", dan, operator, i, operation.operation(dan, i));
        }
    }

    public void printPlusGugu(int dan) {
        printGugudanTemplate(dan, "+", (a, b) -> a + b);
    }

    public void printMultipleGugu(int dan) {
        printGugudanTemplate(dan, "*", (a, b) -> a * b);
    }

    public static void main(String[] args) {
        GugudanAndPlus gugudanAndPlus = new GugudanAndPlus();

        gugudanAndPlus.printPlusGugu(5);
        gugudanAndPlus.printMultipleGugu(8);
    }
}
