package backendschool.week6.babylion;

import java.util.Scanner;

public class Convert {
    public int convertAlphabetToNum(char alpha) {
        return (int)(alpha) - 64;
    }

    public static void main(String[] args) {
        Convert convert = new Convert();

        convert.convertAlphabetToNum('A');
    }
}
