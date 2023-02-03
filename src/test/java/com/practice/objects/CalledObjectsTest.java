package com.practice.objects;

import org.junit.Assert;
import org.junit.Test;

public class CalledObjectsTest {
    private CalledObjects calledObjects = new CalledObjects(100);
    @Test
    public void testMethod(){
        calledObjects.addMoney(20);
        calledObjects.addMoney(120);
        calledObjects.addMoney(210);
        calledObjects.addMoney(201);
        System.out.println(calledObjects.getMoney() > 700 ? "Big":"small");
        System.out.println(Math.abs(-7.8));
        System.out.println(Math.floor(7.8));
        System.out.println(Math.ceil(7.8));
        System.out.println(Math.max(8.9,9.3));
        System.out.println(Math.min(8.9,9.3));
        System.out.println(Math.pow(7,2));
        System.out.println(Math.sqrt(144));

    }
//    @Test
   /* public void callHello(){
        System.out.println(calledObjects.sayHello("Senthi"));
        String returnedName = calledObjects.sayHello("Senthi");
        Assert.assertEquals(returnedName, "Hello boys Senthi");
    }*/
}
