package spring_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testMyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person = context.getBean("personId", Person.class);
//        person.callYourPet();
//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
        System.out.println(person.getSurname()+ " " +
                person.getAge());
        context.close();
    }
}
