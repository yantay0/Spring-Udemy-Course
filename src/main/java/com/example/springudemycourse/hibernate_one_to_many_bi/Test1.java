package com.example.springudemycourse.hibernate_one_to_many_bi;

import com.example.springudemycourse.hibernate_one_to_many_bi.entity.Department;
import com.example.springudemycourse.hibernate_one_to_many_bi.entity.Employee;
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
            session = factory.getCurrentSession();
            Department department = new Department("IT", 300, 1200);
            Employee employee = new Employee("Madina", "Yantay", 400);
            Employee employee1 = new Employee("Elena", "Smirnova", 500);
            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getDepartment());
//            Department department = session.get(Department.class, 1);
//            System.out.println(department.getEmployeeList());
//            session.delete(employee);
//-----------------------------------------------------------------
            session.save(department);
            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();

        }

    }
}
