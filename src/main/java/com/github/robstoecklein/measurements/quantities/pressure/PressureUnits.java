package com.github.robstoecklein.measurements.quantities.pressure;

import com.github.robstoecklein.measurements.units.Unit;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class PressureUnits extends Unit {

    public PressureUnits(String name, String abbr, double scale) {
        super(MEASURE_PRESSURE, name, abbr, scale, 0.0);
    }
}
