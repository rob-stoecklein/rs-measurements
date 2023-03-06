package com.github.robstoecklein.units.temperature;

public class FahrenheitUnits extends TemperatureUnits {

    /**
     * Creates a {@code FahrenheitUnits}.
     * <pre>
     *  degrees-C = (degrees-F - 32.0) / 1.8
     *  degrees-F = (1.8 * degrees-C) + 32.0
     * </pre>
     */
    public FahrenheitUnits() {
        super("fahrenheit", 1.8, 32.0);
    }
}
