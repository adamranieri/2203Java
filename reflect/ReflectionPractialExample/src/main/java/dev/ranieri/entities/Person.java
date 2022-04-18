package dev.ranieri.entities;

import lombok.Data;

//this annotation from lombok uses reflection to read your fields and automatically generate the getters,setters and constructor
//without you having to do ANYTHING else
@Data
public class Person {
    // Java bean. getters and setters, at least a no args constructor
    // boilerplate code is code that does not contain helpful logic
    // it exists to merely structure the application. Generally like to avoid it when possible
    // it really bloats your code making it harder to manage
    private int id;
    private String fname;
    private String lname;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
