package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private static List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student s1 = new Student("Madina Yantay", 4, 4.0);
        Student s2 = new Student("Leila Bekturgan", 3, 3.7);
        Student s3 = new Student("Anna Karenina", 1, 2.1);
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }
    public List<Student> getStudents(){
//        System.out.println("Start of the method getStudents");
//        System.out.println(students.get(3));
        System.out.println("Info from method getStudent:");
        System.out.println(students);
        return students;
    }
}
