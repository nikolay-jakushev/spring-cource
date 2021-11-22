package org.example.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee(
                    "Aleksandr",
                    "Ivanov",
                    "IT",
                    55000);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            int _id = employee.get_id();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee1 = session.get(Employee.class, _id);
            session.getTransaction().commit();
            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
