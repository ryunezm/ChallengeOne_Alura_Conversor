package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitTemperature;

public enum Temperature {
    celsius("Celsius", "°C"),
    kelvin("Kelvin", "K"),
    fahrenheit("Fahrenheit", "°F"),
    rankine("Rankine", "R");

    private String name;
    private String symbol;

    Temperature(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public UnitTemperature getUnit() {
        return new UnitTemperature(name, symbol);
    }
}