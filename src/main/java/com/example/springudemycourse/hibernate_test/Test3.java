package com.example.springudemycourse.hibernate_test;

import com.example.springudemycourse.hibernate_test.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

import java.util.List;


public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            List<Employee> employees = session.createQuery("from Employee").getResultList();
            List<Employee> employees = session.createQuery("from Employee " + "where name = 'Alex' and salary > 600").getResultList();

            for(Employee e: employees){
                System.out.println(e);

            }
            session.getTransaction().commit();
        }
        finally {
            factory.close();

        }

    }
}
