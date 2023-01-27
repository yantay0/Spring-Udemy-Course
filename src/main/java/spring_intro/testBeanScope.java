package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        System.out.println(dog==dog2);
//        dog.setName("Belka");
//        Dog dog2 = context.getBean("myPet", Dog.class);
//        dog2.setName("Strelka");
////        System.out.println("Проверка ссылок " + (dog2==dog));
//        System.out.println(dog2.getName());
//        System.out.println(dog.getName());

        context.close();
    }
}
