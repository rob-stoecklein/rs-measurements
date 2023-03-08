package com.github.robstoecklein.measurements.quantities.pressure;

import com.github.robstoecklein.measurements.units.Unit;

public abstract class PressureUnits extends Unit {

    public PressureUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(MEASURE_PRESSURE, name, plural, abbr, scale, offset, 0, isStandard);
    }
}
