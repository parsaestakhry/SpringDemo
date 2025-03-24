package com.parsa;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Created!");
    }


    @Override
    public void compile(){
        System.out.println("Laptop compiling...");
    }
}
