package com.example.springudemycourse.AOP.aspects;

import com.example.springudemycourse.AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

//@Component
//@Aspect
//@Order(10)
public class LoggingAspect {

    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature "+methodSignature);
        System.out.println("methodSignature.getMethod() "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() "+methodSignature.getName());
        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if(obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println("Info about book - "+
                            book.getName()+", автор - "+ book.getAuthor()+
                            ", year - "+book.getYearOfPublication());
                }
                else if(obj instanceof String){
                    System.out.println("book was added by "+obj);
                }
            }
        }


        System.out.println("beforeGetLoggingAdvice: try and check up to get Book");
        System.out.println("--------------------------------------");
    }

//    @Pointcut("execution(* AOP.UniLibrary.*(..) )")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* AOP.UniLibrary.returnMagazine() )")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()FromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazine(){
//        System.out.println("beforeAllMethodsExceptReturnMagazine");
//    }



//    @Pointcut("execution(* AOP.UniLibrary.get*()) ")
//    private void allGetMethodsFromUniLibrary(){};
//
//    @Pointcut("execution(* AOP.UniLibrary.return*()) ")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//


//    @Before("execution(* get*()) ") // Point cut

//    @Before("execution( * return*())") // Point cut
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: try to return Book");
//    }
}
