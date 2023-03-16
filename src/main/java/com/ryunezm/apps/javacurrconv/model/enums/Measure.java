package com.ryunezm.apps.javacurrconv.model.enums;

public enum Measure {
    SELECT_A_MEASURE("Select a measure", false),
    CURRENCY("Currency", false),
    LENGTH("Length", true),
    MASS("Mass", true),
    TEMPERATURE("Temperature", false),
    TIME("Time", true);

    private final String name;
    private final boolean extended;

    Measure(String name, boolean extended){
        this.name = name;
        this.extended = extended;
    }

    public String getName() {
        return name;
    }

    public boolean isExtended() {
        return extended;
    }
}
