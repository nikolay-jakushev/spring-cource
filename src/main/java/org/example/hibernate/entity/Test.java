package org.example.hibernate.entity;

import org.example.aop.Library;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            //Создание сессии
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee " +
                    "where name = 'Aleksandr'").executeUpdate();
//            Employee employee = session.get(Employee.class, 9);
//            session.delete(employee);
//            employee.setSalary(1500000);

//            session.createQuery("update Employee set salary = 1000 " +
//                    "where name = 'Aleksandr'").executeUpdate();

            session.getTransaction().commit();
            //Создание объекта
//            Employee employee = new Employee(
//                    "Max",
//                    "Mix",
//                    "IT",
//                    670000);
            //Начало транзакции
            //Сохранения работника
//            session.save(employee);
            //Закрытие транзакции
//
//            //Получение id работника из БД
//            //int _id = employee.get_id();
//            //Создание сессии
//            session = factory.getCurrentSession();
//            //Начало сессии
//            session.beginTransaction();
//            //Получение работника
//            //Employee employee1 = session.get(Employee.class, _id);
//
//            List<Employee> employees = session.createQuery("from Employee " +
//                            "where name = 'Aleksandr'")
//                    .getResultList();
//            for (Employee emps : employees) {
//                System.out.println(emps);
//            }

//            session.getTransaction().commit();
//            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
