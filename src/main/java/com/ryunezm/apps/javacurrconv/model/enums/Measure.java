package com.ryunezm.apps.javacurrconv.model.enums;

public enum Measure {
    Select_a_measure, Currency, Length, Mass, Temperature, Time;

    @Override
    public String toString() {
        switch (this){
            case Select_a_measure:
                return "Select a measure";
            default:
                return name();
        }
    }
}
