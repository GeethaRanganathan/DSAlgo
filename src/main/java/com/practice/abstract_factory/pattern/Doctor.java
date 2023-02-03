package com.practice.abstract_factory.pattern;

public class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("I am a Doctor");
    }
}
