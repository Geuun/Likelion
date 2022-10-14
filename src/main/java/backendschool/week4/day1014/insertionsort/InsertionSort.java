package backendschool.week4.day1014.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        /** i = 1 arr[1] vs arr[0]
         * i = 2 arr[2] vs arr[1]
         * i = 2 arr[1] vs arr[0]
         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    return arr;
    }

    public static void main(String[] args) {
        //5에서 출발합니다.
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
//        arr = new int[]{5, 8, 6, 2, 4};
        int[] result = insertionSort.sort(arr);

        System.out.println(Arrays.toString(result));
    }
}
