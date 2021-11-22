package org.example;

import org.example.spring.spring_into.Config;
import org.example.spring.spring_into.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.CallPet();
        context.close();*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.CallPet();
        context.close();

    }
}
