package com.ryunezm.apps.javacurrconv.constants;

import java.util.*;

public class ListMeasures {

    public  static final List<PrefixesIS> PREFIXES = List.of(
            new PrefixesIS("YOTTA", 1e24),
            new PrefixesIS("ZETTA", 1e21),
            new PrefixesIS("EXA", 1e18),
            new PrefixesIS("PETA", 1e15),
            new PrefixesIS("TERA", 1e12),
            new PrefixesIS("GIGA", 1e9),
            new PrefixesIS("MEGA", 1e6),
            new PrefixesIS("KILO", 1e3),
            new PrefixesIS("HECTO", 1e2),
            new PrefixesIS("DECA", 1e1),
            new PrefixesIS("DECI", 1e-1),
            new PrefixesIS("CENTI", 1e-2),
            new PrefixesIS("MILI", 1e-3),
            new PrefixesIS("MICRO", 1e-6),
            new PrefixesIS("NANO", 1e-9),
            new PrefixesIS("PICO", 1e-12),
            new PrefixesIS("FEMTO", 1e-15),
            new PrefixesIS("ATTO", 1e-18),
            new PrefixesIS("ZEPTO", 1e-21),
            new PrefixesIS("YOCTO", 1e-24)
    );

    public static final List<String> MEASURES = List.of(
            "Currency",
            "Length",
            "Mass",
            "Temperature",
            "Time",
            "Velocity",
            "Volume"
    );

    public static final List<String> CURRENCY = List.of(
            "Dollar (US$)",
            "Euro (€)",
            "Japanese yen (¥ / 円)",
            "Sterling (£)",
            "Yuan (¥ / 元)",
            "Australian dollar (A$)",
            "Canadian dollar (C$)",
            "Swiss franc (CHF)",
            "Hong Kong dollar (HK$)",
            "Singapore dollar (S$)",
            "Swedish krona (kr)",
            "South Korean won (₩ / 원)",
            "Norwegian krone (kr)",
            "New Zealand dollar (NZ$)",
            "Indian rupee (₹)",
            "Mexican peso ($)"
    );
    public static final List<String> LENGTH_COMMON = List.of(
            "Kilometers",
            "Meters",
            "Centimeters",
            "Millimeters",
            "Micrometers",
            "Nanometers"
    );
    public static final List<String> LENGTH_EXTENDED = List.of(
            "Yottameters (1e24)",
            "Zettameters (1e21)",
            "Exameters (1e18)",
            "Petameters (1e15)",
            "Terameters (1e12)",
            "Gigameters (1e9)",
            "Megameters (1e6)",
            "Kilometers (1e3)",
            "Hectometers (1e2)",
            "Decameters (1e1)",
            "Meters",
            "Decimeters (1e-1)",
            "Centimeters (1e-2)",
            "Milimeters (1e-3)",
            "Micrometers (1e-6)",
            "Nanometers (1e-9)",
            "Picometers (1e-12)",
            "Femtometers (1e-15)",
            "Attometers (1e-18)",
            "Zeptometers (1e-21)",
            "Yoctometers (1e-24)"
    );

    public static final List<String> LENGTH_USCS = List.of(
            "Nautical miles",
            "Miles",
            "Yards",
            "Feet",
            "Inches"
    );
    public static final List<String> MASS_COMMON = List.of(
            "Metrics tonne (T)",
            "Kilograms",
            "Grams (g)",
            "Milligrams (mg)"
    );

    public static final List<String> MASS_EXTENDED = List.of(
            "Yottagrams (1e24)",
            "Zettagrams (1e21)",
            "Exagrams (1e18)",
            "Petagrams (1e15)",
            "Teragrams (1e12)",
            "Gigagrams (1e9)",
            "Megagram / Metric Tonne (1e6)",
            "Kilograms (1e3)",
            "Hectograms (1e2)",
            "Decagrams (1e1)",
            "Grams",
            "Decigrams (1e-1)",
            "Centigrams (1e-2)",
            "Milligrams (1e-3)",
            "Micrograms (1e-6)",
            "Nanograms (1e-9)",
            "Picograms (1e-12)",
            "Femtograms (1e-15)",
            "Attograms (1e-18)",
            "Zeptograms (1e-21)",
            "Yoctograms (1e-24)"
    );

    public static final List<String> MASS_USCS = List.of(
            "Short tonne (ST)",
            "Quarter (qtr)",
            "Short hundredweight",
            "Arroba (@)",
            "Pound-mass (lb)",
            "Ounce (oz)",
            "Dram (dr)",
            "Grain (gr)"
    );

    public static final List<String> TEMPERATURE = List.of(
            "Kelvin (K)",
            "Celsius (°C)",
            "Rankine (R)",
            "Fahrenheit (°F)"
    );
    public static final List<String> TIME = List.of(
            "Years",
            "Months",
            "Weeks",
            "Days",
            "Hours (h)",
            "Minutes (m)",
            "Seconds (s)"
            );

    public static final List<String> VELOCITY = List.of("");
}