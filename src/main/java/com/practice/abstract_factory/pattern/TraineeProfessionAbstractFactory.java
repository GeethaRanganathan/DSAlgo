package com.practice.abstract_factory.pattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
    public Profession getProfession(String profession) {
        if (profession == null){
            return null;
        }else if (profession == "Doctor"){
            return new TraineeDoctor();
        }else if (profession == "Engineer"){
            return new TraineeEngineer();
        }else if (profession == "Scientist"){
            return new TraineeScientist();
        }
        return null;
    }
}
