package org.example.spring.spring_into;


//@Component("dogBean")
public class Dog implements Pet {
    @Override
    public void Say() {
        System.out.println("Bow-wow");
    }
}
