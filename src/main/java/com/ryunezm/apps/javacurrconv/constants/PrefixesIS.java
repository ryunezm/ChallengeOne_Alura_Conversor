package com.ryunezm.apps.javacurrconv.constants;

/*import java.util.Arrays;
import java.util.Collections;
import java.util.List;
*/
public class PrefixesIS {

    private final String prefix;
    private final double value;

    public PrefixesIS(String prefix, double value) {
        this.prefix = prefix;
        this.value = value;
    }

    public String getPrefix() {return prefix;}

    public double getValue() {return value;}

    /*public static final double YOTTA = 1e24;
    public static final double ZETTA = 1e21;
    public static final double EXA = 1e18;
    public static final double PETA = 1e15;
    public static final double TERA = 1e12;
    public static final double GIGA = 1e9;
    public static final double MEGA = 1e6;
    public static final double KILO = 1e3;
    public static final double HECTO = 1e2;
    public static final double DECA = 1e1;
    public static final double DECI = 1e-1;
    public static final double CENTI = 1e-2;
    public static final double MILI = 1e-3;
    public static final double MICRO = 1e-6;
    public static final double NANO = 1e-9;
    public static final double PICO = 1e-12;
    public static final double FEMTO = 1e-15;
    public static final double ATTO = 1e-18;
    public static final double ZEPTO = 1e-21;
    public static final double YOCTO = 1e-24;

    public static final List<Double> METRIC_PREFIXES = Collections.unmodifiableList(Arrays.asList(
            YOTTA, ZETTA, EXA, PETA, TERA, GIGA, MEGA, KILO, HECTO, DECA,
            DECI, CENTI, MILI, MICRO, NANO, PICO, FEMTO, ATTO, ZEPTO, YOCTO
    ));

    private PrefixesIS() {
        throw new AssertionError();
    }*/
}
