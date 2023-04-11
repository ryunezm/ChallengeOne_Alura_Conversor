package com.ryunezm.apps.javacurrconv.model.enums;

public enum _Measure_ {
    SELECT_A_MEASURE("Select a measure", false),
    CURRENCY("Currency", true),
    LENGTH("Length", true),
    MASS("Mass", true),
    TEMPERATURE("Temperature", true),
    TIME("Time", true);

    private final String name;
    private final boolean extended;

    _Measure_(String name, boolean extended){
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
