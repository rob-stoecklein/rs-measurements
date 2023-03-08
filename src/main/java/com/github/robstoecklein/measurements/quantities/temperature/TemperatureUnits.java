package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.units.Unit;

/**
 * @author Rob Stoecklein (rstoeck@gmail.com)
 * @version 2023-03-08
 */
public abstract class TemperatureUnits extends Unit {

    public TemperatureUnits(String name, String abbr, double scale, double offset) {
        super(MEASURE_TEMPERATURE, name, abbr, scale, offset);
    }

    public static class Celsius extends TemperatureUnits {
        public Celsius() {
            super("Celsius", "°C", 1.0, 0.0);
        }
    }

    public static class Fahrenheit extends TemperatureUnits {
        public Fahrenheit() {
            super("Fahrenheit", "°F", 1.8, 32.0);
        }
    }

    public static class Kelvin extends TemperatureUnits {
        public Kelvin() {
            super("Kelvin", "°K", 1.0, 273.15);
        }
    }
}
