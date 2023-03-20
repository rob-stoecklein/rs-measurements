package com.github.rs.units.quantities.voltage;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class VoltageUnits extends Units {

    public VoltageUnits(String name, String abbr, double scale) {
        super(MEASURE_VOLTAGE, name, abbr, scale, 0.0);
    }
}
