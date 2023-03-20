package com.github.rs.units.quantities.current;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class CurrentUnits extends Units {

    public CurrentUnits(String name, String abbr, double scale) {
        super(MEASURE_CURRENT, name, abbr, scale, 0.0);
    }
}
