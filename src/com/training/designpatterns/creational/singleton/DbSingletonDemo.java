package com.training.designpatterns.creational.singleton;

public class DbSingletonDemo {

    // Demonstrates that the instances are the same object
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);
    }

}
