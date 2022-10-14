package backendschool.week4.day1014.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr, int i) {
        /** i = 1 arr[1] vs arr[0]
         * i = 2 arr[2] vs arr[1]
         * i = 2 arr[1] vs arr[0]
         */
        int j = i;
        if (arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        //5에서 출발합니다.
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr, 1);

        System.out.println(Arrays.toString(result));
    }
}
