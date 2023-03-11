package com.ryunezm.apps.javacurrconv.model.enums;

public enum Mass {

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
    grains("Grains", "gr", 7000/453.59237, true),
    dracmas("Dracmas", "dracmas", 256/453.59237, false),
    ounces("Ounces", "oz", 16/453.59237, true),
    pounds("Pounds", "lb", 1/453.59237, true),
    arrobas("Arrobas", "@", 0.04/453.59237, true),
    quintalUS("Short hundredweight (US)", "quintal(US)", 0.01/453.59237, true),
    quintalUK("Long hundredweight (UK)", "quintal(UK)", (1/112)/453.59237, false),
    quarterUS("Short quarter (US)", "qtr[US]", 0.002/453.59237, true),
    quarterUK("Long quarter (UK)", "qtr[UK]", (1/560)/453.59237, false),
    tonUS("Short ton", "",0.0005/453.59237, true),
    tonUK("Long ton", "",(1/2240)/453.59237, false);


    private String name;
    private String symbol;
    private double factor;
    private boolean commonness;

    Mass(String name, String symbol, double factor, boolean commonness) {
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
        this.commonness = commonness;
    }
}