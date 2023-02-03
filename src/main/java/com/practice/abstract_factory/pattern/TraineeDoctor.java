package com.practice.abstract_factory.pattern;

public class TraineeDoctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am a Trainee Doctor");
    }
}
