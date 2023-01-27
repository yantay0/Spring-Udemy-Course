package AOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook() )")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: "+
                "trying to return book");
        Object targetMethodResult = null;
        try{
             targetMethodResult =  proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice "+
                    "Exception is caught "+ e );
            throw e;
        }
        System.out.println("aroundReturnBookLoggingAdvice "+
                "book is returned");
        return targetMethodResult;
    }
}
