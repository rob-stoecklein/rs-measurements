package com.github.robstoecklein.measurements.quantities.mass;

import com.github.robstoecklein.measurements.units.Unit;

public class MassUnits extends Unit {

    public MassUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(MEASURE_MASS, name, plural, abbr, scale, offset, 0, isStandard);
    }
}
