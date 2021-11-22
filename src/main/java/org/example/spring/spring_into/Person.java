package org.example.spring.spring_into;


import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet){
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void CallPet(){
        System.out.println("Hello my lovely pet!");
        pet.Say();
    }

}
