package org.example.spring.spring_into;


//@Component
public class Cat implements Pet {
    @Override
    public void Say() {
        System.out.println("Meow-meow");
    }
}
