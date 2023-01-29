package com.example.springudemycourse.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try{
//            session = factory.getCurrentSession();
//            Department department = new Department("HR", 500, 1500);
//            Employee employee = new Employee("Madina", "Yantay", 600);
//            Employee employee1 = new Employee("Oleg", "Smirnov", 500);
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            session.beginTransaction();
//
//            session.save(department);
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class, 2);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());

            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
            Department department = session.get(Department.class, 4
            );
            session.delete(department);
            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();

        }

    }
}
