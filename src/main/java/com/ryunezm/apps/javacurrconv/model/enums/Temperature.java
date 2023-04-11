package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitTemperature;

import java.util.Arrays;

public enum Temperature implements EnumFunctions {
    celsius("Celsius", "°C", 1, 0, true),
    kelvin("Kelvin", "K", 1, 273.15, true),
    fahrenheit("Fahrenheit", "°F", (double) 9/5, 32, true),
    rankine("Rankine", "R", (double) 9/5, 273.15*9/5, true),
    reaumur("Réaumur", "°Ré", (double) 4/5, 0, false),
    delisle("Delisle", "°Dé", (double) -3/2, 150, false),
    romer("Rømer", "°Rø", (double) 21/40, 7.5, false);


    private final String name;
    private final String symbol;
    private final double factor;
    private final double complement;
    private final boolean commonness;

    Temperature(String name, String symbol, double factor, double complement, boolean commonness) {
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
        this.complement = complement;
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
        return new UnitTemperature(name, symbol, factor, complement);
    }

    @Override
    public String getLongName() { return name + " (" + symbol+ ")" ; }

    public static Temperature getByLongName(String longName, Temperature[] units){
        return Arrays.stream(units)
                .filter(temperature -> temperature.getLongName().equals(longName))
                .findFirst().
                orElse(null);
    }
}