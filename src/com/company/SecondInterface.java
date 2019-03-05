package com.company;

public interface SecondInterface {
    default void print(){
        System.out.println("Drugi interfejs");
    }
}
