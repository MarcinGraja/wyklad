package com.company;

public class SecondClass extends FirstClass implements FirstInterface, SecondInterface{

    public void print() {
        System.out.println("Nazwałeś obiekt: " + Name);
        FirstInterface.super.print();
        SecondInterface.super.print();
    }
    SecondClass(String Name){
        super(Name);
    }
}