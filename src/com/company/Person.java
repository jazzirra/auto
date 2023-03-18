package com.company;

import com.company.professions.Driver;


public class Person extends Driver {


    public Person() {
    }

    private int age ;

    public Person(String fullName, String experienceDriving, int age) {
        super(fullName, experienceDriving);
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String
    toString() {
        return  super.toString()+
        " age - " + age  ;
    }
}
