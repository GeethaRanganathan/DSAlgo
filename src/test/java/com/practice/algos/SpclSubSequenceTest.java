package com.practice.algos;

import org.junit.Test;

public class SpclSubSequenceTest {
    @Test
    public void testSpclSubSequence(){
        SpclSubSequence spclSubSequence = new SpclSubSequence();
        int count = spclSubSequence.solve("GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ");
        System.out.println("Count of AG: " + count);
    }
}
