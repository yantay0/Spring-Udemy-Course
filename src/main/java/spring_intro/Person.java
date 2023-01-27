package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personId")
public class Person {
//    @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
    public Person(){
        System.out.println("Constructor bean Person");
    }
//@Autowired
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }
//@Autowired
    public void setPet(Pet pet) {
        System.out.println("Setter pet in Person");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println("Person : set Surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Person : setAge");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet");
        pet.say();
    }
}
