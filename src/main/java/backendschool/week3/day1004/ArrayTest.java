package main.java.backendschool.week3.day1004;

public class ArrayTest {
    public static void main(String[] args) {


        /*
         * 10칸의 int array를 만들고
         * 1부터 10까지 채워보세요
         * 그리고 console에 출력 해보세요.
         */

        int[] array = new int[10];
        int a = 1;

        for(int i = 0; i < 10; i++){
            array[i] = a++;
        }

        for (int i: array) {
            System.out.print(i);
        }
    }
}
