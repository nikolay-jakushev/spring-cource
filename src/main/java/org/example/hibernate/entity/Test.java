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
            //Создание сессии
            Session session = factory.getCurrentSession();
            //Создание объекта
            Employee employee = new Employee(
                    "Aleksandr",
                    "Ivanov",
                    "IT",
                    55000);
            //Начало транзакции
            session.beginTransaction();
            //Сохранения работника
            session.save(employee);
            //Закрытие транзакции
            session.getTransaction().commit();

            //Получение id работника из БД
            int _id = employee.get_id();
            //Создание сессии
            session = factory.getCurrentSession();
            //Начало сессии
            session.beginTransaction();
            //Получение работника
            Employee employee1 = session.get(Employee.class, _id);
            //Заркытие сессии
            session.getTransaction().commit();
            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
