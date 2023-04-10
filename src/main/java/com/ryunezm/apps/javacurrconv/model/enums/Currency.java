package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitCurrency;
import java.util.Arrays;

public enum Currency implements EnumFunctions {
    USD("USD", "U.S. dollar", "US$",1 , true),
    AED("AED", "UAE dirham", "د.إ", 3.67, true),
    AUD("AUD", "Australian dollar", "A$", 1.52, true),
    ARS("ARS", "Argentine peso", "ARS$", 213.37, true),
    BRL("BRL", "Brazilian real", "R$", 5.16, true),
    CAD("CAD", "Canadian dollar", "C$", 1.38, true),
    CHF("CHF", "Swiss franc", "CHF", 0.91, true),
    CLP("CLP", "Chilean peso", "CLP$", 796.45, true),
    CNY("CNY", "Renminbi", "¥ / 元", 6.96, true),
    COP("COP", "Colombian peso", "COP$", 4747.51, true),
    CZK("CZK", "Czech koruna", "Kč", 22.33, true),
    DKK("DKK", "Danish krone", "kr", 7.03, true),
    EUR("EUR", "Euro", "€", 0.94, true),
    GBP("GBP", "Sterling", "£", 0.81, true),
    HKD("HKD", "Hong Kong dollar", "HK$", 7.85, true),
    HUF("HUF", "Hungarian forint", "Ft", 361.88, true),
    IDR("IDR", "Indonesian rupiah", "Rp", 15510, true),
    ILS("ILS", "Israeli new shekel", "₪", 3.57, true),
    INR("INR", "Indian rupee", "₹", 82.02, true),
    JPY("JPY", "Japanese yen", "¥ / 円", 136.24, true),
    KRW("KRW", "South Korean won", "₩ / 원", 1325.58, true),
    MXN("MXN", "Mexican peso", "$", 18.34, true),
    MYR("MYR", "Malaysian ringgit", "RM", 4.52, true),
    NOK("NOK", "Norwegian krone", "kr", 10.66, true),
    NZD("NZD", "New Zealand dollar", "NZ$", 1.64, true),
    PHP("PHP", "Philippine peso", "₱", 55.26, true),
    PLN("PLN", "Polish złoty", "zł", 4.43, true),
    RON("RON", "Romanian leu", "L", 4.64, true),
    RUB("RUB", "Russian ruble", "₽", 75.85, true),
    SAR("SAR", "Saudi riyal", "﷼", 3.75, true),
    SEK("SEK", "Swedish krona", "kr", 10.73, true),
    SGD("SGD", "Singapore dollar", "S$", 1.35, true),
    THB("THB", "Thai baht", "฿", 35.02, true),
    TWD("TWD", "New Taiwan dollar", "NT$", 30.82, true),
    TRY("TRY", "Turkish lira", "₺", 18.98, true),
    VEF("VEF", "Venezuelan bolivar", "Bs.", 2411413.51 , true),
    ZAR("ZAR", "South African rand", "R", 18.56, true);


    private final String code;
    private final String name;
    private final String symbol;
    private final double factor;
    private final boolean commonness;

    Currency(String code, String name, String symbol, double factor, boolean commonness) {
        this.code = code;
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

    public UnitCurrency getUnit(){
        return new UnitCurrency(code, name, symbol, factor);
    }

    @Override
    public String getLongName() { return name + " (" + symbol+ ")" ; }

    public static Currency getByLongName(String longName, Currency[] units){
        return Arrays.stream(units)
                .filter(currency -> currency.getLongName().equals(longName))
                .findFirst().
                orElse(null);
    }
}
