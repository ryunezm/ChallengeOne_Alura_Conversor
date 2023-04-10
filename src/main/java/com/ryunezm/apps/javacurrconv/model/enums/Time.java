package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitTime;

import java.util.Arrays;

public enum Time implements EnumFunctions {
    seconds("Seconds", "s", 1, true),
    quettaseconds("Quettaseconds", "Qs", 1e30, false),
    ronnaseconds("Ronnaseconds", "Rs", 1e27, false),
    yottaseconds("Yottaseconds", "Ys", 1e24, false),
    zettaseconds("Zettaseconds", "Zs", 1e21, false),
    exaseconds("Exaseconds", "Es", 1e18, false),
    petaseconds("Petaseconds", "Ps", 1e15, false),
    teraseconds("Teraseconds", "Ts", 1e12, false),
    gigaseconds("Gigaseconds", "Gs", 1e9, false),
    megaseconds("Megaseconds", "Ms", 1e6, false),
    kiloseconds("Kiloseconds", "ks", 1e3, false),
    hectoseconds("Hectoseconds", "hs", 1e2, false),
    decaseconds("Decaseconds", "das", 1e1, false),
    deciseconds("Deciseconds", "ds", 1e-1, false),
    centiseconds("Centiseconds", "cs", 1e-2, false),
    milliseconds("Miliseconds", "ms", 1e-3, true),
    microseconds("Microseconds", "µs", 1e-6, true),
    nanoseconds("Nanoseconds", "ns", 1e-9, false),
    picoseconds("Picoseconds", "ps", 1e-12, false),
    femtoseconds("Femtoseconds", "fs", 1e-15, false),
    attoseconds("Attoseconds", "as", 1e-18, false),
    zeptoseconds("Zeptoseconds", "zs", 1e-21, false),
    yoctoseconds("Yoctoseconds", "ys", 1e-24, false),
    rontoseconds("Rontoseconds", "rs", 1e-27, false),
    quectoseconds("Quectoseconds", "qs", 1e-30, false),
    minutes("Minutes", "min", 60, true),
    hour("Hours", "h", 3600, true),
    days("Days", "day", 86400, true),
    weeks("Weeks", "week", 604800, true),
    years("Years", "year", 31557600, true);

    private final String name;
    private final String symbol;
    private final double factor;
    private final boolean commonness;

    Time(String name, String symbol, double factor, boolean commonness) {
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
        this.commonness = commonness;
    }

    public String getName() { return name; }

    public String getSymbol() { return symbol; }

    public double getFactor() { return factor; }

    public boolean isCommonness() { return commonness; }

    public UnitTime getUnit() {
        return new UnitTime(name, symbol, factor, commonness);
    }

    @Override
    public String getLongName() { return name + " (" + symbol+ ")" ; }

    public static Time getByLongName(String longName, Time[] units){
        return Arrays.stream(units)
                .filter(time -> time.getLongName().equals(longName))
                .findFirst().
                orElse(null);
    }
}
