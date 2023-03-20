package com.github.rs.units.quantities.fuelconsumption;

import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public class FuelConsumptionUnits extends Units {

    public FuelConsumptionUnits(String name, String abbr, Number scale) {
        super(MEASURE_FUEL_CONSUMPTION, name, abbr, scale, 0.0);
    }
}
