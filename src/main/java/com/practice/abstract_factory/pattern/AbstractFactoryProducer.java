package com.practice.abstract_factory.pattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean profession){
        if (profession){
            return new TraineeProfessionAbstractFactory();
        }else{
            return new ProfessionAbstractFactory();
        }
    }
}
