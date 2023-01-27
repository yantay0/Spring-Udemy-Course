package AOP.aspects;

import AOP.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: logging getting "+
                " list of students before method getStudents");
    }
//    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avrGrade = firstStudent.getAvgGrade();
//        avrGrade = avrGrade + 1;
//        firstStudent.setAvgGrade(avrGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: logging getting "+
//                " list of students after method getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents() )",
//    throwing = "exception")
//    public void afterExceptionGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterExceptionGetStudentsLoggingAdvice "+
//                "logging after throws Exception "+ exception);
//    }
    @After("execution( * getStudents() )")
    public void afterFinallyGetStudentsLoggingAdvice(){
        System.out.println("afterFinallyGetStudentsLoggingAdvice "+
                "logging after throws Exception ");
    }
}
