package com.practice.abstract_factory.pattern;

public class ProfessionAbstractFactory extends AbstractFactory {
    public Profession getProfession(String profession) {
        if (profession == null){
            return null;
        }else if (profession == "Doctor"){
            return new Doctor();
        }else if (profession == "Engineer"){
            return new Engineer();
        }else if (profession == "Scientist"){
            return new Scientist();
        }
        return null;
    }
}
