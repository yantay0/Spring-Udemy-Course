package com.example.springudemycourse.hibernate_one_to_one;

import com.example.springudemycourse.hibernate_one_to_one.entity.Detail;
import com.example.springudemycourse.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee e = new Employee("Blad", "Sidorov", "IT", 2000);
//            Detail detail = new Detail("Moscow", "324459", "Blad@kbtu.kz");
//            e.setEmpDetail(detail);
//            detail.setEmployee(e);
            Detail detail = session.get(Detail.class, 12);
            detail.getEmployee().setEmpDetail(null);
//            System.out.println(detail.getEmployee());
//            detail.getEmployee().setEmpDetail(null);
//            session.save(detail);
            session.delete(detail);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }

    }
}
