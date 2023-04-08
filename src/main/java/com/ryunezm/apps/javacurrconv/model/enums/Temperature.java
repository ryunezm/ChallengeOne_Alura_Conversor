package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitTemperature;

public enum Temperature implements EnumFunctions {
    celsius("Celsius", "°C", true),
    kelvin("Kelvin", "K", true),
    fahrenheit("Fahrenheit", "°F", true),
    rankine("Rankine", "R", true),
    reaumur("Réaumur", "°Ré", false),
    delisle("Delisle", "°Dé", false),
    romer("Rømer", "°Rø", false);


    private final String name;
    private final String symbol;
    private final boolean commonness;

    Temperature(String name, String symbol, boolean commonness) {
        this.name = name;
        this.symbol = symbol;
        this.commonness = commonness;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isCommonness() {return commonness;}

    public UnitTemperature getUnit() {
        return new UnitTemperature(name, symbol, commonness);
    }

    @Override
    public String getLongName() { return name + " (" + symbol+ ")" ; }
}