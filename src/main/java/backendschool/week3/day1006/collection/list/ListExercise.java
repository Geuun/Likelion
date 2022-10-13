package main.java.backendschool.week3.day1006.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    // 보안을 위해 private 접근지정자 설정
    private List<String> students;

    public ListExercise() {
//        System.out.println(students);
        this.students = new ArrayList<>();
        this.students.add("김재근");
        this.students.add("가나다");
        this.students.add("라마바");
    }

    // 외부에서 접근하기 위해 get 메서드 생성
    public List<String> getStudents() {
        return this.students;
    }
}
