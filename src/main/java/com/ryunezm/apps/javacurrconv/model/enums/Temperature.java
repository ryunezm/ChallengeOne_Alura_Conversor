package com.ryunezm.apps.javacurrconv.model.enums;

public enum Temperature {
    kelvin("Kelvin", "K");

    private String name;
    private String symbol;

    Temperature(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}