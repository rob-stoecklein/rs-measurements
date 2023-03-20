package com.github.rs.units.quantities.energy;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class EnergyUnits extends Units {

    public EnergyUnits(String name, String abbr, Number scale) {
        super(MEASURE_ENERGY, name, abbr, scale, 0.0);
    }
}
