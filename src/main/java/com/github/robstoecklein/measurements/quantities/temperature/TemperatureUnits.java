package com.github.robstoecklein.measurements.quantities.temperature;

import com.github.robstoecklein.measurements.units.Unit;

public abstract class TemperatureUnits extends Unit {

    public TemperatureUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(MEASURE_TEMPERATURE, name, plural, abbr, scale, offset, 0, isStandard);
    }

    public static class Celsius extends TemperatureUnits {
        public Celsius() {
            super("Celsius", "", "C", 1.0, 0.0, true);
        }
    }

    public static class Fahrenheit extends TemperatureUnits {
        public Fahrenheit() {
            super("Fahrenheit", "", "F", 1.8, 32.0, false);
        }
    }

    public static class Kelvin extends TemperatureUnits {
        public Kelvin() {
            super("Kelvin", "", "k", 1.0, 273.15, false);
        }
    }
}
