package backendschool.week4.day1014.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        int i = 0;
        return new int[]{};
    }

    public static void main(String[] args) {
        //5에서 출발합니다.
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}