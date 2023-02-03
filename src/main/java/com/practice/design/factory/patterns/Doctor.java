package com.practice.design.factory.patterns;

public class Doctor implements  Profession{
    @Override
    public void print() {
        System.out.println("I am a Doctor");
    }
}
