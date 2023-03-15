package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitLength;

public enum Length {

    meter("Meters", "m", 1, true),
    quettameters("Quettameters", "Qm", 1e30, false),
    ronnameters("Ronnameters", "Rm", 1e27, false),
    yottameters("Yottameters", "Ym", 1e24, false),
    zettameters("Zettameters", "Zm", 1e21, false),
    exameters("Exameters", "Em", 1e18, false),
    petameters("Petameters", "Pm", 1e15, false),
    terameters("Terameters", "Tm", 1e12, false),
    gigameters("Gigameters", "Gm", 1e9, false),
    megameters("Megameters", "Mm", 1e6, false),
    kilometers("Kilometers", "km", 1e3, true),
    hectometers("Hectometers", "hm", 1e2, false),
    decameters("Decameters", "dam", 1e1, false),
    decimeters("Decimeters", "dm", 1e-1, true),
    centimeters("Centimeters", "cm", 1e-2, true),
    milimeters("Milimeters", "mm", 1e-3, true),
    micrometers("Micrometers", "µm", 1e-6, true),
    nanometers("Nanometers", "nm", 1e-9, false),
    picometers("Picometers", "pm", 1e-12, false),
    femtometers("Femtometers", "fm", 1e-15, false),
    attometers("Attometers", "am", 1e-18, false),
    zeptometers("Zeptometers", "zm", 1e-21, false),
    yoctometers("Yoctometers", "ym", 1e-24, false),
    rontometers("Rontometers", "rm", 1e-27, false),
    quectometers("Quectometers", "qm", 1e-30, false),
    leagues("Leagues", "leagues", 4828.032, true),
    miles("Miles", "mi.", 1609.344, true),
    furlong("Furlong", "furlong", 201.168, false),
    chain("Chains", "chains", 20.1168, false),
    rod("Rods", "rods", 5.0292, false),
    yards("Yards", "yd", 0.9144, true),
    feet("Feet", "ft", 0.3048, true),
    inches("Inches", "in", 0.0254, true),
    mils("Mils", "thou in", 0.0000254, false),
    nautical_leagues("Nautical leagues", "nau. leagues", 5558, true),
    nautical_miles("Nautical miles", "nau. mi.", 1852, true),
    cable_length("Cable lengths", "cable lengths", 185.2, false),
    fathom("Fathom", "ftm", 1.8288, false),
    astronomical_unit("Astronomical units", "AU", 1495978707e2, false),
    light_year("Light years", "ly", 94607304725808e2, false),
    parsec("Parsec", "pc", 3.0856775814913673e16, false);


    private String name;
    private String symbol;
    private double factor;
    private boolean commonness;

    Length(String name, String symbol, double factor, boolean commonness) {
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
        this.commonness = commonness;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getFactor() {
        return factor;
    }

    public boolean isCommonness() {
        return commonness;
    }

    public UnitLength getUnit(){
        return new UnitLength(name, symbol, factor, commonness);
    }
}
