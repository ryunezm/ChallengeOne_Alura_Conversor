package com.ryunezm.apps.javacurrconv.constants;

public enum Currency {
    USD("USD", "U.S. dollar", "US$",1 ),
    EUR("EUR", "Euro", "€", 0.94),
    JPY("JPY", "Japanese yen", "¥ / 円", 136.24),
    GBP("GBP", "Sterling", "£", 0.84),
    CNY("CNY", "Renminbi", "¥ / 元", 6.96),
    AUD("AUD", "Australian dollar", "A$", 1.52),
    CAD("CAD", "Canadian dollar", "C$", 1.38),
    CHF("CHF", "Swiss franc", "CHF", 0.93),
    HKD("HKD", "Hong Kong dollar", "HK$", 7.85),
    SGD("SGD", "Singapore dollar", "S$", 1.35),
    SEK("SEK", "Swedish krona", "kr", 10.73),
    KRW("KRW", "South Korean won", "₩ / 원", 1325.58),
    NOK("NOK", "Norwegian krone", "kr", 10.66),
    NZD("NZD", "New Zealand dollar", "NZ$", 1.64),
    INR("INR", "Indian rupee", "₹", 82.02),
    MXN("MXN", "Mexican peso", "$", 18.34),
    TWD("TWD", "New Taiwan dollar", "NT$", 30.82),
    ZAR("ZAR", "South African rand", "R", 18.56),
    BRL("BRL", "Brazilian real", "R$", 5.16),
    DKK("DKK", "Danish krone", "kr", 7.03),
    PLN("PLN", "Polish złoty", "zł", 4.43),
    THB("THB", "Thai baht", "฿", 35.02),
    ILS("ILS", "Israeli new shekel", "₪", 3.57),
    IDR("IDR", "Indonesian rupiah", "Rp", 15510),
    CZK("CZK", "Czech koruna", "Kč", 22.33),
    AED("AED", "UAE dirham", "د.إ", 3.67),
    TRY("TRY", "Turkish lira", "₺", 18.98),
    HUF("HUF", "Hungarian forint", "Ft", 361.88),
    CLP("CLP", "Chilean peso", "CLP$", 796.45),
    SAR("SAR", "Saudi riyal", "﷼", 3.75),
    PHP("PHP", "Philippine peso", "₱", 55.26),
    MYR("MYR", "Malaysian ringgit", "RM", 4.52),
    COP("COP", "Colombian peso", "COL$", 4747.51),
    RUB("RUB", "Russian ruble", "₽", 75.85),
    RON("RON", "Romanian leu", "L", 4.64);


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
}
