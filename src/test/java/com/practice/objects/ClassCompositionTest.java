package com.practice.objects;

import org.junit.Test;

public class ClassCompositionTest {
    @Test
    public void testBirthday(){
        Birthday bday = new Birthday(12, 10, 1982);
        ClassComposition classComposition = new ClassComposition("Geeth", bday);
        classComposition.printData();
    }
}
