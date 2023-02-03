package com.practice.design.factory.patterns;

import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProfessionFactoryMain {
    public static final int END= Integer.MAX_VALUE;
    public static final int START= END - 100;
    public static void main(String[] args){
//        List<Engineer> engList = new ArrayList<>();
//        engList.add(new Engineer(1, 500));
//        engList.add(new Engineer(2, 2000));
//        engList.add(new Engineer(3, 1500));
//        engList.add(new Engineer(4, 1000));
//        List<Engineer> sortedList = engList.stream().sorted((o1, o2) -> (int)(o2.getSal()- o1.getSal())).limit(3).skip(2).collect(Collectors.toList());
//        System.out.println(sortedList);

//        ProfessionalFactory professionalFactory = new ProfessionalFactory();
//        Profession scientist = professionalFactory.getProfession("Scientist");
//        scientist.print();
//        final String dog="length: 10";
//        final String pig="length: " + dog.length();
//        System.out.println("Animals are equal: " + pig==dog );
//        System.out.println(" " + "Animals are equal: " + (pig==dog) );
////        try{
////            System.out.println("Hello world");
////        }catch (IOException e){
////            System.out.println("println fail");
////        }
//        BigInteger ft = new BigInteger("5000");
//        BigInteger fyt = new BigInteger("50000");
//        BigInteger fhunt = new BigInteger("500000");
//        BigInteger total = new BigInteger("500000");
//        BigInteger sum = BigInteger.ZERO;
//        fhunt = ft.add(fyt);
//        System.out.println(fhunt);
//        total.add(fyt);
//        //total.add(fhunt);
//        System.out.println(total);
//        int count=0;
//        for (int i=START;i<=END;i++){
//            if (count<=100){
//                System.out.println("i " + i);
//            }
//            count++;
//        }
//        System.out.println(count);
       // A a = new B();
        A.sound();
    }
}
