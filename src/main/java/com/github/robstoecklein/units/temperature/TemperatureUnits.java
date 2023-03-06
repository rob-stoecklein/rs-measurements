package com.github.robstoecklein.units.temperature;

import com.github.robstoecklein.units.Unit;

public abstract class TemperatureUnits extends Unit {

    public TemperatureUnits(String name, double scale, double offset) {
        super(name, scale, offset);
    }
}
