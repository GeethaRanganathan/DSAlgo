package com.practice.objects;

import org.junit.Test;

public class StaticExmplTest {
    @Test
    public void staticTest(){
        StaticExmpl staticExmpl1 = new StaticExmpl("Pranesh", "Senthil");
        StaticExmpl staticExmpl2 = new StaticExmpl("Divyesh", "Senthil");
        System.out.println("player name : " + staticExmpl1.getFirstName());
        System.out.println("Total : " + StaticExmpl.getTotal());

    }
}
