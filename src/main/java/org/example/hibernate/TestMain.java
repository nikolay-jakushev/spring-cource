package org.example.hibernate;

import org.example.hibernate.entity.Detail;
import org.example.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee("Natalia", "Kuzminova", "QA", 450);
            Detail detail = new Detail("Omsk", "+799842234", "n.kuz@mfdsg.com");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
        }
    }
}
