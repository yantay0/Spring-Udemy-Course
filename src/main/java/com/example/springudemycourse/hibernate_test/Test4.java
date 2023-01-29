package com.example.springudemycourse.hibernate_test;

import com.example.springudemycourse.hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee e = session.get(Employee.class, 1);
//            e.setSalary(1400);
            session.createQuery("update Employee set salary=1000 where surname= 'Ivanov'").executeUpdate();
            session.getTransaction().commit();
        }
        finally {
            factory.close();

        }

    }
}
