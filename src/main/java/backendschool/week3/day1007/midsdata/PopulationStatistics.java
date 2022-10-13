package main.java.backendschool.week3.day1007.midsdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void createAFile(String filename) {
        File file = new File(filename);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);//new FileReader(File location);
        // === 아직까진 파일을 읽지 않음=== //

        String fileContents = "";
        while (fileContents.length() < 1000000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public String readByOneLine(String filename) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        return reader.readLine();
    }

    public void readByLine2(String filename) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public PopulationMove parse(String data) {
        //String data = "50,130,62000 ......."
        //csv
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[6], splittedLine[0]); // 전입 to 전출from
    }

    public static void main(String[] args) throws Exception {

        String fileAddress = "/Users/geun/Downloads/2021인구이동/2021_인구관련연간자료_20221006_17518.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
//        populationStatistics.readByLine2(fileAddress);
/*        List<PopulationMove> pml = populationStatistics.readByOneLine(fileAddress);

        for(PopulationStatistics pm : pml) {
            System.out.println("전입:%s, 전출:%s\n", pm.getFromSido, pm.getToSido());
        }
        System.out.println(pml.size());*/

    }
}