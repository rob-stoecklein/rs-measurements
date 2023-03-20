package com.github.rs.units.quantities.resistance;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class ResistanceUnits extends Units {

    public ResistanceUnits(String name, String abbr, Number scale) {
        super(MEASURE_RESISTANCE, name, abbr, scale, 0.0);
    }
}
