package com.github.robstoecklein.measurements.quantities.time;

import com.github.robstoecklein.measurements.units.Unit;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class TimeUnits extends Unit {

    public TimeUnits(String name, String abbr, double scale, double offset) {
        super(MEASURE_TIME, name, abbr, scale, offset);
    }
}
