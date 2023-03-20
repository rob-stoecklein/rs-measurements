package com.github.rs.units.quantities.power;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class PowerUnits extends Units {

    public PowerUnits(String name, String abbr, Number scale) {
        super(MEASURE_POWER, name, abbr, scale, 0.0);
    }
}
