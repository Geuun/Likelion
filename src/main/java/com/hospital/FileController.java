package com.hospital;

import com.hospital.parser.HospitalParser;
import com.hospital.parser.Parser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.*;

public class FileController<T> {
    Parser<T> parser;

    boolean isRemoveColumnName = true;

    public FileController(Parser<T> parser) {
        this.parser = parser;
    }

    public FileController(Parser<T> parser, boolean isRemoveColumnName) {
        this.parser = parser;
        this.isRemoveColumnName = isRemoveColumnName;
    }

    public List<T> readLines(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader br; // = new BufferedReader(new FileReader(filename));
        br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8);
        String str;
        if (isRemoveColumnName) {
            br.readLine();
        }
        while ((str = br.readLine()) != null) {
            result.add(parser.parse(str));
        }
        return result;
    }

    //파일 생성
    public void createANewFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
        System.out.println("Have a file generated?: " + file.exists());
    }

    public void writeLines(List<String> lines, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer
                    = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8));
            for (String str : lines) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("success");
    }

}
