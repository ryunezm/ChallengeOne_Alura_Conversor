package com.ryunezm.apps.javacurrconv.model;

public class MeasureTemperature extends Measure{

    public MeasureTemperature(String name, String symbol) {
        super(name, symbol);
    }

    /**
     * @param quantity
     * @param unitTarget
     * @return
     */
    @Override
    public double Convert(double quantity, Measure unitTarget) {
        return 0;
    }
}
