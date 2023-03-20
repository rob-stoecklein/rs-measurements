package com.github.rs.units.quantities.pressure;

import com.github.rs.units.units.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class PressureUnits extends Units {

    public PressureUnits(String name, String abbr, double scale) {
        super(MEASURE_PRESSURE, name, abbr, scale, 0.0);
    }
}
