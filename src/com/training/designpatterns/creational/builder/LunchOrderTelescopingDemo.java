package com.training.designpatterns.creational.builder;

public class LunchOrderTelescopingDemo {

    public static void main(String[] args) {
        LunchOrderTelescoping lunchOrderBean = new LunchOrderTelescoping("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println("Bread: " + lunchOrderBean.getBread());
        System.out.println("Condiments: " + lunchOrderBean.getCondiments());
        System.out.println("Dressing: " + lunchOrderBean.getDressing());
        System.out.println("Meat: " + lunchOrderBean.getMeat());
    }

}
