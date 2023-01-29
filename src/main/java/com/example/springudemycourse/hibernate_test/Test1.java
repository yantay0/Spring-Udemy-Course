package com.example.springudemycourse.hibernate_test;

import com.example.springudemycourse.hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            Employee e = new Employee("Leyla", "Bekturgan", "IT", 1000);
            session.beginTransaction();
            session.save(e);
            session.getTransaction().commit();
            System.out.println(e);
        }
        finally {
            factory.close();

        }

    }
}
