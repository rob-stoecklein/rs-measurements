package com.github.robstoecklein.measurements.quantities.time;

import com.github.robstoecklein.measurements.units.Unit;

public abstract class TimeUnits extends Unit {

    public TimeUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(MEASURE_TIME, name, plural, abbr, scale, offset, 0, isStandard);
    }
}
