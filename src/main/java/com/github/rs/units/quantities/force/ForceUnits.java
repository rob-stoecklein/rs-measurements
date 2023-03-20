package com.github.rs.units.quantities.force;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class ForceUnits extends Units {

    public ForceUnits(String name, String abbr, Number scale) {
        super(MEASURE_FORCE, name, abbr, scale, 0.0);
    }
}
