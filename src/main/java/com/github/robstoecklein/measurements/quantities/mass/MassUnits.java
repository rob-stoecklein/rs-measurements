package com.github.robstoecklein.measurements.quantities.mass;

import com.github.robstoecklein.measurements.units.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public class MassUnits extends Units {

    public MassUnits(String name, String abbr, double scale) {
        super(MEASURE_MASS, name, abbr, scale, 0.0);
    }
}
