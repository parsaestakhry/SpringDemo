package com.parsa;

public class Alien {


    private  int age;
    private  Laptop laptop;
    private int salary;
    private  Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Alien(int age, Laptop laptop, int salary){
        this.age = age;
        this.laptop = laptop;
        this.salary = salary;
        System.out.println("Constructor is called woooooooooo");
    }


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
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
