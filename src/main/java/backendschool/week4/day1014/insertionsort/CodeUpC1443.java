package backendschool.week4.day1014.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUpC1443 {
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
        Scanner sc = new Scanner(System.in);
        int numCnt = sc.nextInt();
        int[] arr = new int[numCnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        CodeUpC1443 main = new CodeUpC1443();
//        arr = new int[]{5, 8, 6, 2, 4};
        int[] result = main.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i]);
        }
    }
}

