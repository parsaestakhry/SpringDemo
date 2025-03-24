package com.parsa;

public class Alien {


    private  int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter is called");
        this.age = age;
    }

    public Alien() {
        System.out.println("Object Created!");
    }

    public void coding() {
        System.out.println("Coding");
    }
}
