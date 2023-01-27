package spring_intro;

import org.springframework.stereotype.Component;

//@Component ("catId")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
