package com.github.rs.units.quantities.speed;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class SpeedUnits extends Units {

    public SpeedUnits(String name, String abbr, double scale) {
        super(MEASURE_SPEED, name, abbr, scale, 0.0);
    }
}
