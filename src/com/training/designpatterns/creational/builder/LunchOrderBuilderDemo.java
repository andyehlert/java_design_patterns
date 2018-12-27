package com.training.designpatterns.creational.builder;

public class LunchOrderBuilderDemo {

    public static void main(String[] args) {
        LunchOrder.LunchOrderBuilder builder = new LunchOrder.LunchOrderBuilder();

        LunchOrder lunchOrder = builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham").build();

        System.out.println("Bread: " + lunchOrder.getBread());
        System.out.println("Condiments: " + lunchOrder.getCondiments());
        System.out.println("Dressing: " + lunchOrder.getDressing());
        System.out.println("Meat: " + lunchOrder.getMeat());
    }

}
