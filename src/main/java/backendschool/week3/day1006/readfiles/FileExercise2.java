package main.java.backendschool.week3.day1006.readfiles;

import java.io.FileReader;
import java.io.IOException;

public class FileExercise2 {

    public  char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    public String read2Char(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }

    public static void main(String[] args) throws IOException {
        FileExercise2 fileExercise2 = new FileExercise2();

        char c = fileExercise2.readAChar("./src/main.java.backendschool.week3/day1006/readfiles/ReadFile.txt");
        System.out.println(c);

        String str = fileExercise2.read2Char("./src/main.java.backendschool.week3/day1006/readfiles/ReadFile.txt");
        System.out.println(str);
    }
}
