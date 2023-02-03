package com.practice.objects;

public class ClassComposition {
    String name;
    Birthday bday;
    public ClassComposition(String name, Birthday bday){
        this.name = name;
        this.bday = bday;
    }
    public void printData(){
        System.out.println("Name of person : " + name );
        bday.printBday();
    }
}
