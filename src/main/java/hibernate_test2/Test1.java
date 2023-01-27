package hibernate_test2;

import com.fasterxml.jackson.databind.DatabindException;
import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try{
//            Session session = factory.getCurrentSession();
//            Employee e = new Employee("Madina", "Yantay", "IT", 1000);
//            Detail detail = new Detail("Almaty", "12334", "my@kbtu.kz");
//            e.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(e);
//            session.getTransaction().commit();
//


//            Session session = factory.getCurrentSession();
//            Employee e = new Employee("Anna", "Ivanova", "Sales", 400);
//            Detail detail = new Detail("Astana", "34524", "ai@kbtu.kz");
//            e.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(e);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee e = session.get(Employee.class, 1);
//            System.out.println(e.getEmpDetail());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee e = session.get(Employee.class, 2);
            session.delete(e);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();

        }

    }
}
