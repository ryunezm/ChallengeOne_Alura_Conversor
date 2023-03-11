package com.ryunezm.apps.javacurrconv.model;

public class MeasureMass extends Measure{
    private String system;
    private double factor;
    private boolean commonness;

    public MeasureMass(String name, String symbol, double factor, boolean commonness) {
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
