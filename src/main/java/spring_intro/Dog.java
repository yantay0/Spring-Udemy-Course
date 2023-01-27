package spring_intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("singleton")
public class Dog implements Pet{
    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
//    @PostConstruct
//    public void init(){
//        System.out.println("init");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("destroy");
//    }
}
