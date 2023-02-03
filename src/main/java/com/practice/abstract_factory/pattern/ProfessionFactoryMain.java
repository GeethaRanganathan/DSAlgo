package com.practice.abstract_factory.pattern;

import com.practice.design.factory.patterns.B;

public class ProfessionFactoryMain {

    public static void main(String[] args){
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession scientist = abstractFactory.getProfession("Scientist");
        scientist.print();
    }
}
