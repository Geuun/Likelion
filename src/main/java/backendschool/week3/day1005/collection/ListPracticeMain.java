package main.java.backendschool.week3.day1005.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        // LikeLion2th 객체 생성
        LikeLion2th likeLion2th = new LikeLion2th();
        //LikeLion 객체의 getStudentList 메서드를 List students로 선언
        List<String> students = likeLion2th.getStudentList();

        // for문을 돌면서 students 안에 있는 student를 모두 출력
        for (String studnet : students) {
            System.out.println(studnet);
        }

        // List의 size 출력
        System.out.println(students.size());
    }
}
