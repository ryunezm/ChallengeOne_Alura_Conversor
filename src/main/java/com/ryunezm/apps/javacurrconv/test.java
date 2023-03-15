package com.ryunezm.apps.javacurrconv;

import java.util.ArrayList;
import java.util.Arrays;

import com.ryunezm.apps.javacurrconv.model.enums.*;

public class test {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(Currency.values()));
        System.out.println(Arrays.asList(Length.values()));
        System.out.println(Arrays.asList(Mass.values()));
        System.out.println(Arrays.asList(Temperature.values()));
        System.out.println(Arrays.asList(Time.values()));
        System.out.println(Arrays.asList(Measure.values()));

        for (Temperature t : Temperature.values()){
            System.out.println(t.getName()+": "+t.getSymbol());
        }

    }
}
