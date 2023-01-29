package com.example.springudemycourse.hibernate_many_to_many;

import com.example.springudemycourse.hibernate_many_to_many.entity.Child;
import com.example.springudemycourse.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Child.class).
                addAnnotatedClass(Section.class).
                buildSessionFactory();

        Session session = null;
        try{
//            session = sessionFactory.getCurrentSession();
//
//            Section section = new Section("Dance");
//            Child child = new Child("Olga",11);
//            Child child1 = new Child("Polina", 9);
//            Child child2 = new Child("Monica", 12);
//            section.addSectionToChild(child);
//            section.addSectionToChild(child1);
//            section.addSectionToChild(child2);
//            session.beginTransaction();
//
//            session.persist(section);


//            session.save(child);
//            session.save(child1);
//            session.save(child2);


//            session.getTransaction().commit();
//            System.out.println("Done");
//          --------------------------------------------------------------
//
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            List<Child> all = session.createQuery("from Child where id >=4 and id <=6 ").getResultList();
//            for(Child i : all){
//                session.delete(i);
//            }
//            session.getTransaction().commit();

//            Section section1 = new Section("Math");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Tennis");
//
//            Child child3 = new Child("Ali", 10);
//
//            child3.addSectionToChild(section1);
//            child3.addSectionToChild(section2);
//            child3.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child3);
//            session.getTransaction().commit();
//            System.out.println("Done");
//            -----------------------------------------------------------------------------------

            session = sessionFactory.getCurrentSession();
//
            session.beginTransaction();
            Child child = session.get(Child.class,8);
            session.delete(child);
////            System.out.println(section);
////            System.out.println(section.getChildren());
////            Child child = session.get(Child.class, 7);
////            System.out.println(child);
////            System.out.println(child.getSections());
            session.getTransaction().commit();


        }
        finally {
            session.close();
            sessionFactory.close();

        }

    }
}
