package com.training.designpatterns.creational.builder;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println("Bread: " + lunchOrderBean.getBread());
        System.out.println("Condiments: " + lunchOrderBean.getCondiments());
        System.out.println("Dressing: " + lunchOrderBean.getDressing());
        System.out.println("Meat: " + lunchOrderBean.getMeat());
    }

}
