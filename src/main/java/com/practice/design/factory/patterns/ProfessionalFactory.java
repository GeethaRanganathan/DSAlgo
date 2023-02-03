package com.practice.design.factory.patterns;

public class ProfessionalFactory {

    public Profession getProfession(String profession) {
        if (profession == null){
            return null;
        }else if (profession == "Doctor"){
            return new Doctor();
        }else if (profession == "Engineer"){
            return new Engineer(1,1);
        }else if (profession == "Scientist"){
            return new Scientist();
        }
        return null;
    }
}
