package com.github.rs.units.quantities.digitalstorage;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class DigitalStorageUnits extends Units {

    public DigitalStorageUnits(String name, String abbr, double scale) {
        super(MEASURE_DIGITAL_STORAGE, name, abbr, scale, 0.0);
    }
}
