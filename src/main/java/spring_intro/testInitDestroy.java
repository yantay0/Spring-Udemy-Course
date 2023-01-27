package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testInitDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
        dog.say();
        dog2.say();
        context.close();

    }
}
