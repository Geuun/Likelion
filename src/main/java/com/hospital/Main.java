package com.hospital;

import hospital.FileController;
import hospital.domain.Hospital;
import hospital.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        String filename = "/Users/geun/Desktop/CodeLion/data/hospital/서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital: hospitals) {
            System.out.printf("%s, %s, %s, %s, %s, %s, %s",
                    hospital.getId(), hospital.getAddress(), hospital.getDistrict()
                    , hospital.getCategory(), hospital.getEmergencyRoom(), hospital.getName(),
                    hospital.getSubdivision());
        }

        List<String> lines = new ArrayList<>();
        Hospital hospital = new Hospital();
        lines.add(hospital.getSqlInsertQuery());
        for (Hospital hospital1 : hospitals) {
            lines.add(hospital1.getTupleString());
        }
        lines.add(hospital.insertSemi());

        String sqlFilename = "./src/main/java/com/hospital/sql/hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(lines, sqlFilename);
    }
}
