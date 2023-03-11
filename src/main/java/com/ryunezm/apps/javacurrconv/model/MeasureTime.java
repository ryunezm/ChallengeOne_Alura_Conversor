package com.ryunezm.apps.javacurrconv.model;

public class MeasureTime extends Measure{
    private double factor;
    private boolean commonness;

    public MeasureTime(String name, String symbol, double factor, boolean commonness) {
        super(name, symbol);
        this.factor = factor;
        this.commonness = commonness;
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
