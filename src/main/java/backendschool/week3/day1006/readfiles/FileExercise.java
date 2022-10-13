package main.java.backendschool.week3.day1006.readfiles;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {

        File dir = new File("./");
        File files[] = dir.listFiles();


        for(File file : files) {
            System.out.println(file);
        }
    }
}
