package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.units.Units;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-16
 */
public abstract class TemperatureUnits extends Units {

    public TemperatureUnits(String name, String abbr, double scale, double offset) {
        super(MEASURE_TEMPERATURE, name, abbr, scale, offset);
    }

    public static class Celsius extends TemperatureUnits {
        protected Celsius() {
            super("Celsius", "°C", 1.0, 0.0);  // STANDARD
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
