package com.github.rs.units.quantities.area;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class AreaUnits extends Units {

    public AreaUnits(String name, String abbr, Number scale) {
        super(MEASURE_AREA, name, abbr, scale, 0.0);
    }
}
