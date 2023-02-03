package com.practice.objects;

import org.junit.Test;

public class EnumUsageTest {
@Test
    public void testEnum(){
    EnumUsage enumUsage = new EnumUsage();
    enumUsage.printEnum();
}
@Test
    public void testEnumFor(){
    EnumUsage enumUsage = new EnumUsage();
    enumUsage.enumInForLoop();
    }
}

