package main.java.backendschool.week3.day1006.collection.list;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        for (String student : listExercise.getStudents()) {
            System.out.println(student);
        }
        System.out.println("총 학생 수는 " + listExercise.getStudents().size() + " 명 입니다.");
    }

}
