package com.example.springudemycourse.spring_intro;

import org.springframework.context.annotation.Scope;

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
