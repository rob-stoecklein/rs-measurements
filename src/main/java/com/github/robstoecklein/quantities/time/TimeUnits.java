package com.github.robstoecklein.quantities.time;

import com.github.robstoecklein.units.Unit;

public abstract class TimeUnits extends Unit {

    public TimeUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(MEASURE_TIME, name, plural, abbr, scale, offset, 0, isStandard);
    }
}
