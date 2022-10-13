package main.java.backendschool.week4.day1012;

public class CodeUpMax {
    public int[] getMax(int[] arr) {
        // loop 구성
        int maxIdx = 0;
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};

        CodeUpMax codeUpMax = new CodeUpMax();
        int[] result = codeUpMax.getMax(arr);
        if (result[0] == -3 && result[1] == 0) {
            System.out.println("테스트를 통과 했습니다.");
        } else {
            System.out.println("테스트를 통과하지 못했습니다. result:" + result);
        }
    }
}
