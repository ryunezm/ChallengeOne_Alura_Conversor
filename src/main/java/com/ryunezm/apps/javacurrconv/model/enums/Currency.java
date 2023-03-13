package com.ryunezm.apps.javacurrconv.model.enums;

import com.ryunezm.apps.javacurrconv.model.UnitCurrency;

public enum Currency {
    USD("USD", "U.S. dollar", "US$",1 ),
    AED("AED", "UAE dirham", "د.إ", 3.67),
    AUD("AUD", "Australian dollar", "A$", 1.52),
    ARS("ARS", "Argentine peso", "ARS$", 0.042),
    BRL("BRL", "Brazilian real", "R$", 5.16),
    CAD("CAD", "Canadian dollar", "C$", 1.38),
    CHF("CHF", "Swiss franc", "CHF", 0.93),
    CLP("CLP", "Chilean peso", "CLP$", 796.45),
    CNY("CNY", "Renminbi", "¥ / 元", 6.96),
    COP("COP", "Colombian peso", "COP$", 4747.51),
    CZK("CZK", "Czech koruna", "Kč", 22.33),
    DKK("DKK", "Danish krone", "kr", 7.03),
    EUR("EUR", "Euro", "€", 0.94),
    GBP("GBP", "Sterling", "£", 0.84),
    HKD("HKD", "Hong Kong dollar", "HK$", 7.85),
    HUF("HUF", "Hungarian forint", "Ft", 361.88),
    IDR("IDR", "Indonesian rupiah", "Rp", 15510),
    ILS("ILS", "Israeli new shekel", "₪", 3.57),
    INR("INR", "Indian rupee", "₹", 82.02),
    JPY("JPY", "Japanese yen", "¥ / 円", 136.24),
    KRW("KRW", "South Korean won", "₩ / 원", 1325.58),
    MXN("MXN", "Mexican peso", "$", 18.34),
    MYR("MYR", "Malaysian ringgit", "RM", 4.52),
    NOK("NOK", "Norwegian krone", "kr", 10.66),
    NZD("NZD", "New Zealand dollar", "NZ$", 1.64),
    PHP("PHP", "Philippine peso", "₱", 55.26),
    PLN("PLN", "Polish złoty", "zł", 4.43),
    RON("RON", "Romanian leu", "L", 4.64),
    RUB("RUB", "Russian ruble", "₽", 75.85),
    SAR("SAR", "Saudi riyal", "﷼", 3.75),
    SEK("SEK", "Swedish krona", "kr", 10.73),
    SGD("SGD", "Singapore dollar", "S$", 1.35),
    THB("THB", "Thai baht", "฿", 35.02),
    TWD("TWD", "New Taiwan dollar", "NT$", 30.82),
    TRY("TRY", "Turkish lira", "₺", 18.98),
    VEF("VEF", "Venezuelan bolivar", "Bs.", 2411413.51 ),
    ZAR("ZAR", "South African rand", "R", 18.56);


    private String code;
    private String name;
    private String symbol;
    private double factor;

    Currency(String code, String name, String symbol, double factor) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
        this.factor = factor;
    }

    public String getCode() {
        return code;
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

    public UnitCurrency getUnit(){
        return new UnitCurrency(code, name, symbol, factor);
    }
}
