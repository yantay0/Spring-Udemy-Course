package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class testAfter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
//        university.getStudents();
        try{
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e){
            System.out.println("Exception is caught");
        }

        context.close();
    }
}
