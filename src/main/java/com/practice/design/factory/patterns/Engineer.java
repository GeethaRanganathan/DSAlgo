package com.practice.design.factory.patterns;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Engineer implements Profession{
    private int id;
    private long sal;
    @Override
    public void print() {
        System.out.println("I am an Engineer");

    }

}
