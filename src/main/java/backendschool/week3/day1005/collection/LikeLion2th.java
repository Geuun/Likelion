package main.java.backendschool.week3.day1005.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 멋사자 2기 학생의 이름이 들어있는 list를 return하는 method
 */

public class LikeLion2th {
    private List<String> student = new ArrayList<>(); // student List 생성

    public LikeLion2th() {                            // 기본생성자
        Names names = new Names();                    // names Class 객체 생성
        student = names.names();                      // names Class의 names 메서드를 student로 선언
    }

    public List<String> getStudentList() {
        return this.student;
    }
}
