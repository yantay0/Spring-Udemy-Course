package com.example.springudemycourse.hibernate_test;

import com.example.springudemycourse.hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee e = session.get(Employee.class, 1);
//            session.delete(e);
            session.createQuery("delete Employee "+"where salary=1000").executeUpdate();
            session.getTransaction().commit();
        }
        finally {
            factory.close();

        }

    }
}
