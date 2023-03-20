package com.github.rs.units.quantities.temperature;

import com.github.rs.units.util.MathConstants;
import com.github.rs.units.quantities.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-20
 */
public abstract class TemperatureUnits extends Units {

    public TemperatureUnits(String name, String abbr, double scale, double offset) {
        super(MEASURE_TEMPERATURE, name, abbr, scale, offset);
    }

    public static class Celsius extends TemperatureUnits {
        protected Celsius() {
            super("Celsius", "°C", MathConstants.NUM_STD, 0.0);  // STANDARD
        }
    }

    public static class Fahrenheit extends TemperatureUnits {
        protected Fahrenheit() {
            super("Fahrenheit", "°F", 1.8, 32.0);
        }
    }

    public static class Kelvin extends TemperatureUnits {
        protected Kelvin() {
            super("Kelvin", "°K", 1.0, 273.15);
        }
    }

    public static class Rankine extends TemperatureUnits {
        protected Rankine() {
            super("Rankine", "°R", 1.8, 491.67);
        }
    }
}
