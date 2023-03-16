package com.practice.LiskovSubstituionPrinciple;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class PracticeLSPWildCard {
    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        House house = new House();
        printBuild(building);
        printBuild(office);
        printBuild(house);

        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building());
        printBuildList(buildingList);

        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office());
        printBuildList(officeList);

        List<House> houseList = new ArrayList<>();
        houseList.add(new House());
        printBuildList(houseList);
    }
    public static void printBuild(Building building){
        System.out.println("constructing a new " + building.toString());
    }
    public static void printBuildList(List<? extends Building> buildingList){
        for (Building b: buildingList){
            System.out.println("constructing a row of " + b.toString());
        }
    }
    public static void addHouse(List<? super House> buildingList){
        for (Object b: buildingList){
            System.out.println("constructing a row of " + b.toString());
        }
        buildingList.add(new House());

    }
}
