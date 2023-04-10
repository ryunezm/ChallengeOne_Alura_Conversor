package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitMass;

import java.util.Arrays;

public enum Mass implements EnumFunctions {

    gram("Grams", "g", 1, true),
    quettagrams("Quettagrams", "Qg", 1e30, false),
    ronnagrams("Ronnagrams", "Rg", 1e27, false),
    yottagrams("Yottagrams", "Yg", 1e24, false),
    zettagrams("Zettagrams", "Zg", 1e21, false),
    exagrams("Exagrams", "Eg", 1e18, false),
    petagrams("Petagrams", "Pg", 1e15, false),
    teragrams("Teragrams", "Tg", 1e12, false),
    gigagrams("Gigagrams", "Gg", 1e9, false),
    megagrams("Megagrams or Metric tonne", "Mg or t", 1e6, true),
    kilograms("Kilograms", "kg", 1e3, true),
    hectograms("Hectograms", "hg", 1e2, false),
    decagrams("Decagrams", "dag", 1e1, false),
    decigrams("Decigrams", "dg", 1e-1, false),
    centigrams("Centigrams", "cg", 1e-2, false),
    milligrams("Milligrams", "mg", 1e-3, true),
    micrograms("Micrograms", "µg", 1e-6, false),
    nanograms("Nanograms", "ng", 1e-9, false),
    picograms("Picograms", "pg", 1e-12, false),
    femtograms("Femtograms", "fg", 1e-15, false),
    attograms("Attograms", "ag", 1e-18, false),
    zeptograms("Zeptograms", "zg", 1e-21, false),
    yoctograms("Yoctograms", "yg", 1e-24, false),
    rontograms("Rontograms", "rg", 1e-27, false),
    quectograms("Quectograms", "qg", 1e-30, false),
    grains("Grains", "gr", 453.59237/7000, true),
    dracmas("Dracmas", "dracmas", 453.59237/256, false),
    ounces("Ounces", "oz", 453.59237/16, true),
    pounds("Pounds", "lb", 453.59237, true),
    arrobas("Arrobas", "@", 453.59237*25, true),
    quintalUS("Short hundredweight (US)", "quintal(US)", 453.59237*1e2, true),
    quintalUK("Long hundredweight (UK)", "quintal(UK)", 453.59237*112, false),
    quarterUS("Short quarter (US)", "qtr[US]", 453.59237*5e2, true),
    quarterUK("Long quarter (UK)", "qtr[UK]", 453.59237*560, false),
    tonUS("Short ton", "ST",453.59237*2000, true),
    tonUK("Long ton", "LT",453.59237*2240, false);


    private final String name;
    private final String symbol;
    private final double factor;
    private final boolean commonness;

    Mass(String name, String symbol, double factor, boolean commonness) {
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

    public boolean isCommonness() {
        return commonness;
    }

    public UnitMass getUnit() {
        return new UnitMass(name, symbol, factor, commonness);
    }

    @Override
    public String getLongName() { return name + " (" + symbol+ ")" ; }

    public static Mass getByLongName(String longName, Mass[] units){
        return Arrays.stream(units)
                .filter(mass -> mass.getLongName().equals(longName))
                .findFirst().
                orElse(null);
    }
}