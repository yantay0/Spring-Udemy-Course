package AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("AOP.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: throws/handle " +
                " Exceptions when try to get book/magazine");
        System.out.println("--------------------------------------");
    }
}
