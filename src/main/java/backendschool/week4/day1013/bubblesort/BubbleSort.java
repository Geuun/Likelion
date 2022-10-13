package main.java.backendschool.week4.day1013.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //7 vs 2
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차 순으로 정렬하는 알고리즘을 짜보자.
        BubbleSort bubbleSort = new BubbleSort();

        int[] result = bubbleSort.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
