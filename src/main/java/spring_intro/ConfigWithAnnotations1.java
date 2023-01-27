package spring_intro;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//@Lazy(false)
public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();
        Person person = context.getBean("personId", Person.class);
        System.out.println(person.getSurname());
        person.callYourPet();
        context.close();
    }
}
