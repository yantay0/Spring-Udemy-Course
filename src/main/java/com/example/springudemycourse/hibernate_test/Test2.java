package com.example.springudemycourse.hibernate_test;

import com.example.springudemycourse.hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            Employee e = new Employee("Oleg", "Sidorov", "HR", 200);
            session.beginTransaction();
            session.save(e);
//            session.getTransaction().commit();
//            System.out.println(e);
            int id = e.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee e1 = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println(e1);
        }
        finally {
            factory.close();

        }

    }
}
