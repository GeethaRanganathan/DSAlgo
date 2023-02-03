package com.practice.objects;

import org.junit.Test;

public class FuncOverloadingTest {
    @Test
    public void printRuns(){
        FuncOverloading funcOverloading = new FuncOverloading();
        funcOverloading.batsman();
        funcOverloading.batsman(50);
    }
}
