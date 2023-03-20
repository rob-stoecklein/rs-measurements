package com.github.rs.units.quantities.time;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class TimeUnits extends Units {

    public TimeUnits(String name, String abbr, Number scale, double offset) {
        super(MEASURE_TIME, name, abbr, scale, offset);
    }
}
