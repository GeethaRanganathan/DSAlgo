package com.practice.objects;

public class StaticExmpl {
    private String firstName;
    private  String lastname;
    private static int total;

    public StaticExmpl(String fname, String lname){
        firstName = fname;
        lastname = lname;
        total++;
        System.out.println("Total is : " + total);
    }
    public String getFirstName(){
        return firstName;
    }
    public static int getTotal(){
        return total;
    }
}
