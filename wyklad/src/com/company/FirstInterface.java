package com.company;

public interface FirstInterface {
    default void print(){
        System.out.println("Pierwszy interfejs");
    }
}
