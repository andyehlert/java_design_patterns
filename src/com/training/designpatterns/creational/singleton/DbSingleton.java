package com.training.designpatterns.creational.singleton;

public class DbSingleton {

    // Makes threadsafe by using volatile to prevent JVM from instantiating another instance
    private static volatile DbSingleton instance = null;

    // Makes threadsafe by ensuring reflection is not used to instantiate another instance
    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        // Makes the singleton lazily loaded
        if (instance == null) {
            // Makes threadsafe by removing initialization race condition in a performant way
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}
