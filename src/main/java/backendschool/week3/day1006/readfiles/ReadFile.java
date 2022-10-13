package main.java.backendschool.week3.day1006.readfiles;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./src/main.java.backendschool.week3/day1006/readfiles/ReadFile.txt");

        int ch= reader.read();
        System.out.print((char) ch);
    }
}