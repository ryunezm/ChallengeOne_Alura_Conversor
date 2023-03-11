package com.ryunezm.apps.javacurrconv.constants;

import java.util.*;

public class ListMeasures {

    public static final List<String> MEASURES = List.of(
            "Currency",
            "Length",
            "Mass",
            "Temperature",
            "Time",
            "Velocity",
            "Volume"
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